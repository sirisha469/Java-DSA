package BinarySearch;
//https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountain {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 5, 3, 2, 1};
    int target = 3;

    int ans = search(arr, target);
    System.out.println(ans);
  }

  static int search(int[] arr, int target){
    int peak = peakIndexInMountainArray(arr);
    int firstTry = orderAgnosticsBS(arr, target, 0, peak);
    if(firstTry != -1){
      return firstTry;
    }
    
    return orderAgnosticsBS(arr, target, peak+1, arr.length-1);
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

    return start; //return start or end both are same
      
  }

  static int orderAgnosticsBS(int[] arr, int target, int start, int end){

    //finding that array is sorted in ascending or decending order
    boolean isAsc= arr[start] < arr[end];


    while(start <= end){
      //finding middle element
      int mid=(start+end)/2;
      //int mid=start+(end-start)/2;

      if(arr[mid] == target){
        return mid;
      }
      
      if(isAsc){
        if(target > arr[mid]){
          start=mid+1;
        }else{
          end=mid-1;
        }
      }
      else{
        if(target > arr[mid]){
          end=mid-1;
        }else{
          start=mid+1;
        }
      }
    }
    return -1;
  }
}
