package practicum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorkFromHome {

  static String solution(int n) {
    var sb = new StringBuilder();
    while (n > 0) {
      sb.insert(0, String.valueOf(n % 2));
      n = n / 2;
    }

    return sb.toString();
  }

  public static void main(String[] args) throws NumberFormatException, IOException {
    var br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(solution(Integer.parseInt(br.readLine())));
  }

}
