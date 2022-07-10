package pointers;

public class StrStr {
  public static int strStr(String haystack, String needle) {
    for (var i = 0; i < haystack.length(); i++) {
      var j = i;
      var k = 0;

      while (j < haystack.length() && k < needle.length() && haystack.charAt(j) == needle.charAt(k)) {
        k++;
        j++;
      }

      if (k == needle.length()) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    //System.out.println(strStr("adcdde", "dd"));
    System.out.println(strStr("mississippi", "issip"));
  }
}
