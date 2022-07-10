package pointers;

import java.util.Arrays;

public class RemoveDuplicates {
  public static int solution(int[] nums) {
    var j = 1;
    var k = 0;

    for (int i = 0; i < nums.length; i = j) {
      while (j < nums.length && nums[i] >= nums[j]) {
        j++;
      }
      nums[k] = nums[i];
      k++;
    }

    return k;
  }

  public static void main(String[] args) {
    var arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    var res = solution(arr);
    System.out.println(res);
    System.out.println(Arrays.toString(arr));
  }
}
