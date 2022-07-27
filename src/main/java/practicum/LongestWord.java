package practicum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestWord {

  public static void solution(String strings[]) {
    var max = 0;
    var maxLength = strings[max].length();

    for (int i = 1; i < strings.length; i++) {
      var str = strings[i];
      var len = str.length();
      if (len > maxLength) {
        max = i;
        maxLength = len;
      }
    }

    System.out.println(strings[max]);
    System.out.println(strings[max].length());
  }

  public static void main(String[] args) throws IOException {
    var br = new BufferedReader(new InputStreamReader(System.in));
    // skip first
    br.readLine();
    var strings = br.readLine().split(" ");

    solution(strings);
  }

}
