package practicum;

import java.util.Scanner;

public class EvenOdd {

  public static String solution(int a, int b, int c) {
    return (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) || (a % 2 == 1 && b % 2 == 1 && c % 2 == 1) ? "WIN" : "FAIL";
  }

  public static void main(String[] args) {
    var sc = new Scanner(System.in);

    var a = Math.abs(sc.nextInt());
    var b = Math.abs(sc.nextInt());
    var c = Math.abs(sc.nextInt());
    System.out.println(solution(a, b, c));
  }

}
