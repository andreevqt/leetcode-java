package practicum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

  static boolean isPalindrome(String str) {
    var sb = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
      var ch = str.charAt(i);
      if (!Character.isAlphabetic(ch) && !Character.isDigit(ch)) {
        continue;
      }

      sb.append(Character.toLowerCase(str.charAt(i)));      
    }

    var s = sb.toString();

    var l = 0;
    var r = s.length() - 1;

    while (l < r) {
      if (s.charAt(l) != s.charAt(r)) {
        return false;
      }
      l++;
      r--;
    }

    return true;
  }

  public static void main(String[] args) throws NumberFormatException, IOException {
    var reader = new BufferedReader(new InputStreamReader(System.in));
    var str = reader.readLine();

    System.out.println(isPalindrome(str) ? "True": "False");
  }

}
