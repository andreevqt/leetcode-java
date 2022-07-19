package practicum;

import java.util.Scanner;

public class FunctionValue {

  public static int solution(int a, int x, int b, int c) {
    return a * x * x + b * x + c;
  }

  public static void main(String[] args) {
    var sc = new Scanner(System.in);

    var a = sc.nextInt();
    var x = sc.nextInt();
    var b = sc.nextInt();
    var c = sc.nextInt();

    System.out.println(solution(a, x, b, c));
  }
}
