package strings;

public class LongestPrefix {

  public static String longestCommonPrefix(String[] strs) {
    var str = strs[0];
    var k = 0;

    for (int i = 0; i < str.length(); i++) {
      var matches = 0;
      for (int j = 1; j < strs.length; j++) {
        var otherStr = strs[j];

        if (i > otherStr.length() - 1 || str.charAt(i) != otherStr.charAt(i)) {
          break;
        }
        matches++;
      }

      if (matches != strs.length - 1) {
        break;
      }

      k++;
    }

    return str.substring(0, k);
  }

  public static void main(String[] args) {
    System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
  }
}
