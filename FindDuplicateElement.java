//https://leetcode.com/problems/find-the-duplicate-number/
public class FindDuplicateElement {
  public static void main(String[] args) {
    int[] arr = {1,3,4,2,2};
    System.out.println(DuplicateElement(arr));
  }

  public static int DuplicateElement(int[] nums){
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

    //last element after cyclic sort
    return nums[len-1];
  }

  public static void swap(int[] nums, int i, int correctIndex) {
    int temp = nums[i];
    nums[i] = nums[correctIndex];
    nums[correctIndex] = temp;
  }
}
