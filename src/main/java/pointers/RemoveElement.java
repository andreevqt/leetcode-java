package pointers;

import java.util.Arrays;

public class RemoveElement {
  public static int removeElement(int[] nums, int val) {
    var j = 0;
    for (int i = 0; i < nums.length; i++) {
      while (j < nums.length && nums[j] == val ) {
        j++;
      }
      if (j < nums.length) {
        nums[i] = nums[j];
      }
    }
    return j;
  }

  public static void main(String[] args) {
    var nums = new int[]{3, 2, 2, 3};
    var k = 3;
    var result = removeElement(nums, k);
    System.out.println(result);
    System.out.println(Arrays.toString(nums));
  }
}
