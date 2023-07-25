//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class FirstLastPosition {
  public static void main(String[] args) {
    int[] arr = {2, 3, 7, 7, 7, 7, 8, 8, 9};
    int target = 9;

    int[] ans = searchRange(arr, target);
    System.out.println(Arrays.toString(ans));

  }

  public static int[] searchRange(int[] nums, int target) {
    int[] ans ={-1, -1};

    ans[0] = searchIndex(nums, target, true);
    if(ans[0] != -1){
      ans[1] = searchIndex(nums, target, false);
    }
    

    // ans[0] = start;
    // ans[1] = end;

    return ans;

  }

  public static int searchIndex(int[] arr, int target, boolean firstIndex){
    int ans = -1;
    int start = 0, end = arr.length-1;

    while(start <= end){
      int mid = start + (end - start)/2;
      if(target > arr[mid]){
        start = mid + 1;
      }
      else if(target < arr[mid]){
        end = mid - 1;
      }
      else{
        ans = mid;
        if(firstIndex){
          end = mid - 1;
        } 
        else{
          start = mid + 1;
        }
      }
    }
    return ans;
  }

}

