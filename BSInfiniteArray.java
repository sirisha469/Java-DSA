public class BSInfiniteArray {
  public static void main(String[] args) {
    int[] arr = {2, 3, 5, 7, 9, 11, 15, 20, 23, 30, 33};
    int target = 7;

    int ans = rangeCreation(arr, target);
    System.out.println(ans);
  }

  static int rangeCreation(int[] arr, int target){

    int start = 0, end = 1;
    //Initially the box contains 2 values
    while(target > arr[end]){
      // new start stored in temp
      int temp = end + 1; 
      //Every time the box value will be doubled

      end = end + (end - start + 1) * 2; //double the box size
      start = temp;

    }

    return binarySearch(arr, target, start, end);

  }
  
  static int binarySearch(int[] arr, int target, int start, int end){

    while(start <= end){
      int mid = start + (end - start)/2;

      if(target > arr[mid]){
        start = mid +1;
      }
      else if(target < arr[mid]){
        end = mid - 1;
      }
      else {
        return mid;
      }
    }

    return -1;
  }
}
