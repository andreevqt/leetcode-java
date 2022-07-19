package practikum;

import java.util.Scanner;
import java.util.Arrays;

public class Neighbours {
  public final static int BOUND = -9999;

  private static int[][] makeField(int[][] matrix, int x, int y) {
    var n = matrix.length;
    var m = matrix[0].length;
    var field = new int[n + 2][];
    for (int i = 0; i < field.length; i++) {
      field[i] = new int[m + 2];
      Arrays.fill(field[i], BOUND);
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        field[i + 1][j + 1] = matrix[i][j];
      }
    }

    return field;
  }

  public static void solution(int[][] matrix, int x, int y) {
    var field = makeField(matrix, x, y);
    if (field[x][y + 1] != BOUND) {
            
    }
  }

  public static void main(String[] args) {
    var sc = new Scanner(System.in);
    var n = sc.nextInt();
    var m = sc.nextInt();

    var matrix = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    var x = sc.nextInt();
    var y = sc.nextInt();

    solution(matrix, x, y);
  }

}
