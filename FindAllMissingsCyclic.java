//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class FindAllMissingsCyclic {
  public static void main(String[] args) {
    int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
    List<Integer> list=allMissingNumbers(arr);
    System.out.println(list);
  }

  //numbers 1 to N
  public static List<Integer> allMissingNumbers(int[] nums){
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

    List<Integer> ans = new ArrayList<>();
    for(int j=0;j<len;j++){
      if(nums[j]!=j+1){
        ans.add(j+1);
      }
    }
    return ans;
  }

  public static void swap(int[] nums, int i, int correctIndex) {
    int temp = nums[i];
    nums[i] = nums[correctIndex];
    nums[correctIndex] = temp;
  }
}
