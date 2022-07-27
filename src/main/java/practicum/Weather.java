package practicum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Weather {

  public static int solution(int arr[]) {
    var count = 0;

    var newArr = new int[arr.length + 2];
    Arrays.fill(newArr, Integer.MIN_VALUE);

    for (int i = 0; i < arr.length; i++) {
      newArr[i + 1] = arr[i];
    }

    for (int i = 1; i < newArr.length - 1; i++) {
      if (newArr[i] > newArr[i - 1] && newArr[i] > newArr[i + 1]) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) throws NumberFormatException, IOException {
    var br = new BufferedReader(new InputStreamReader(System.in));
    var n = Integer.parseInt(br.readLine());

    var arr = new int[n];
    var tokenizer = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(tokenizer.nextToken());
    }

    System.out.println(solution(arr));
  }

}
