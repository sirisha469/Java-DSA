//https://leetcode.com/problems/missing-number/
//amazon-question


public class MissingNumberCyclic {
  public static void main(String[] args) {
    int[] arr = {0, 4, 1, 3, 5};
    int num=missingNumber(arr);
    System.out.println(num);
  }

  // here the values of array starting from 0 to N
  // element == index
  public static int missingNumber(int[] arr) {
    int i=0, len= arr.length;
    while (i < len){
      int correctIndex = arr[i];
      if(arr[i] < len && arr[i] != arr[correctIndex]){
        swap(arr, i, correctIndex);
      }
      else{
        i++;
      }
    }

    for(int j=0; j<len; j++){
      if(arr[j]!=j){
        return j;
      }
    }
    return len;
  }

  

  static void swap(int[] arr, int i, int correctIndex) {
    int temp = arr[i];
    arr[i] = arr[correctIndex];
    arr[correctIndex] = temp;
  }
}
