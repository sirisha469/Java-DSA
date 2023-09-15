package Cyclic_Sort;
//https://leetcode.com/problems/find-the-duplicate-number/

public class FindDuplicateElement {
  public static void main(String[] args) {
    int[] arr = {4, 3, 2, 7, 6, 2, 1};
    System.out.println(duplicateElement(arr));
  }

  public static int duplicateElement(int[] nums){
    int i=0, len=nums.length;
    while(i < len){

      if(nums[i]!= i+1){
        int correctIndex = nums[i] - 1;
        if(nums[i]!=nums[correctIndex]){
          swap(nums, i, correctIndex);
        }
        else{
          return nums[i];
        }
      }
      else{
        i++;
      }
     
    }

    return -1;
    //last element after cyclic sort
    //return nums[len-1];
  }

  public static void swap(int[] nums, int i, int correctIndex) {
    int temp = nums[i];
    nums[i] = nums[correctIndex];
    nums[correctIndex] = temp;
  }
}
