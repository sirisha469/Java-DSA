import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = {1, 3, 5, 4, 2};
    bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  // Best case time complexity: O(n) [for sorted arry] 1 2 3 4 5 - n times
  // worst case time complexity: O(n^2) [for descending order array] 5 4 3 2 1 - n^2 times
  public static void bubbleSort(int[] arr){
    int len=arr.length;
    boolean swapped;
    for(int i=0;i<len;i++){
      swapped=false;
      for(int j=1; j< len-i; j++){
        if(arr[j] < arr[j-1]){
          int temp= arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;
          swapped=true;
        }
      }
      //if the swapping is not at all happend then the array is sorted and break the loop
      if(!swapped){
        break;
      }
    }

  }
}
