import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = {1, 5, 3, 4, 2};
    selectionSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void selectionSort(int[] arr) {
    int len=arr.length;
    for(int i=0; i<len;i++){
      int last = len-1-i;
      int maxIndex = getMaxValue(arr, 0, last);

      swap(arr,maxIndex,last);
    }
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second]; 
    arr[second] = temp;
  }

  private static int getMaxValue(int[] arr, int start, int last) {
    int max = start;
    for(int i=start; i<=last; i++){
      if(arr[max] < arr[i])
        max = i;
    }
    return max;
  }
}
