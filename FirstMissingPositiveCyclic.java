//https://leetcode.com/problems/first-missing-positive/

public class FirstMissingPositiveCyclic {
  public static void main(String[] args) {
    int[] nums = {7, 8, 9, 11, 12};
    System.out.println(missingNumber(nums));
  }

  public static int missingNumber(int[] arr) {
    int i=0, len= arr.length;
    while (i < len){
      int correctIndex = arr[i];
      if(arr[i]>0 && arr[i] <= len && arr[i] != arr[correctIndex]){
        swap(arr, i, correctIndex);
      }
      else{
        i++;
      }
    }

    for(int j=0; j<len; j++){
      if(arr[j]!=j){
        return j+1;
      }
    }
    return len-1;
  }

  static void swap(int[] arr, int i, int correctIndex) {
    int temp = arr[i];
    arr[i] = arr[correctIndex];
    arr[correctIndex] = temp;
  }
}
