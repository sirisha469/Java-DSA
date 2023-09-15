package Cyclic_Sort;
//https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class SetMismatchCyclic {
  public static void main(String[] args) {
    int[] arr = {1,2,2,4};
    int[] a=findError(arr);
    System.out.println(Arrays.toString(a));
  }

   public static int[] findError(int[] nums){
    int i=0, len=nums.length;
    while(i < len){
      int correctIndex = nums[i] - 1;
      if(nums[i]!=nums[correctIndex]){
        swap(nums, i, correctIndex);
      }
      else{
        i++;
      }
    }

    for(int j=0;j<len;j++){
      if(nums[j]!=j+1){
        return new int[] {nums[j], j+1};
      }
    }
    return new int[] {-1,-1};
  }

  public static void swap(int[] nums, int i, int correctIndex) {
    int temp = nums[i];
    nums[i] = nums[correctIndex];
    nums[correctIndex] = temp;
  }
}
