package BinarySearch;
public class CeilingBinarySearch {
  public static void main(String[] args) {
    int[] arr = {2,3,8,14,16,19,20};
    int target = 24;

    int ans = ceilingBS(arr, target);
    System.out.println("Ceiling number index of the target:"+ans);

  }

  public static int ceilingBS(int[] arr, int target){

    int start=0, end=arr.length-1;

    if(target > arr[end]){
      return -1;
    }

    while(start <= end){

      int mid = (start + end)/2;
      if(target > arr[mid]){
        start=mid+1;
      }
      else if(target < arr[mid]){
        end=mid-1;
      }
      else{
        return mid;
      }
    }

    return start;
  }
}
