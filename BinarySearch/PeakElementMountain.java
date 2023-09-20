package BinarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakElementMountain {
  public static void main(String[] args) {
    int[] arr = {2, 3, 5, 6, 7, 5, 3, 2};
    int ans = peakIndexInMountainArray(arr);
    System.out.println("Index of peak element: "+ans);
  }

  static int peakIndexInMountainArray(int[] arr) {
    int start = 0, end = arr.length-1;

    while(start < end){
      int mid = start + (end - start)/2;
      if(arr[mid] > arr[mid+1]){
        //we are desecending part of the array
        end = mid;
      }
      else{
        //we are descending part of the array 
        //In this mid+1 is greater than mid so start = mid+1;
        start = mid + 1;
      }
    }

    //in the end of the process, start == end and pointing to largest number 
    //start and end are always trying to find maximum element int the above 2 checks

    return end; //here we can return start or end both are equal.
      
  }


}
