//https://leetcode.com/problems/create-target-array-in-the-given-order/description/
package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetArrayOrder {
  public static void main(String[] args) {
    int[] nums = {0,1,2,3,4};
    int[] index = {0,1,2,2,1};
    int[] ans = createTargetArray(nums,index);
    System.out.println(Arrays.toString(ans));
    //System.out.println(args);
  }

  static int[] createTargetArray(int[] nums, int[] index) {
      ArrayList<Integer> arr = new ArrayList<>();
      int len =nums.length;
      for(int i=0;i<len;i++){
          arr.add(index[i],nums[i]);
      }

      int[] ans = new int[len];

      for(int i=0;i<len;i++){
          ans[i] = arr.get(i);
      }

      return ans;
    }
}
