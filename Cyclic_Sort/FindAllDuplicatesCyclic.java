package Cyclic_Sort;
import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesCyclic {
  public static void main(String[] args) {
    int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
    List<Integer> list=allDuplicateElement(arr);
    System.out.println(list);
  }

  public static List<Integer> allDuplicateElement(int[] nums){
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
        ans.add(nums[j]);
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
