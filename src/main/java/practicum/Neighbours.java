package practicum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Neighbours {

  private static final int[] di = new int[]{1, 0, 0, -1};
  private static final int[] dj = new int[]{0, -1, 1, 0};

  public static List<Integer> solution(int[][] matrix, int x, int y) {
    var res = new ArrayList<Integer>();
    var n = matrix.length;
    var m = matrix[0].length;

    for (int i = 0; i < di.length; i++) {
      var dx = x + di[i];
      var dy = y + dj[i];
      if ((dx > n - 1 || dx < 0) || (dy < 0 || dy > m - 1)) {
        continue;
      }

      var value = matrix[dx][dy];
      res.add(value);
    }

    res.sort(Integer::compareTo);
    return res;
  }

  public static void main(String[] args) throws IOException {
    var reader = new BufferedReader(new InputStreamReader(System.in));
    var n = Integer.parseInt(reader.readLine());
    var m = Integer.parseInt(reader.readLine());

    var matrix = new int[n][m];
    for (int i = 0; i < n; i++) {
      var tokenizer = new StringTokenizer(reader.readLine());
      for (int j = 0; j < m; j++) {
        matrix[i][j] = Integer.parseInt(tokenizer.nextToken());
      }
    }

    var x = Integer.parseInt(reader.readLine());
    var y = Integer.parseInt(reader.readLine());


    var res = solution(matrix, x, y);
    var sb = new StringBuilder();
    res.forEach((item) -> sb.append(item).append(" "));
    System.out.println(sb);
  }
}
