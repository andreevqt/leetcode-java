package practicum;

public class AddNumbers {

  void solution(String a, String b) {
    var min = a.length() > b.length() ? b : a;
    var max = a.length() < b.length() ? b : a;

    for (int i = 0; i < min.length(); i++) {
      var val1 = Integer.valueOf(a.charAt(i));
      var val2 = Integer.valueOf(b.charAt(i));
    }

    return;
  }

  public static void main(String[] args) {

  }

}
