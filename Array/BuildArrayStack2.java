//https://leetcode.com/problems/build-an-array-with-stack-operations/?envType=daily-question&envId=2023-11-03
package Array;

import java.util.ArrayList;
import java.util.List;

public class BuildArrayStack2 {
  public static void main(String[] args) {
    int[] arr = {1,3};
    int n = 3;
    buildArray2(arr, n);
    // System.out.println(binarySearch(arr, n));
  }
  //method2
    public static void buildArray2(int[] target, int n) {
      List<String> list = new ArrayList<>();
      
      for(int i=1;i<=n;i++){
        
        boolean ans = binarySearch(target,i);
        // System.out.println(ans);

         if(ans){
             list.add("Push");
         }
         else{
          if(i-1 == target[target.length-1]){
            break;
          }
           else{
            list.add("Push");
            list.add("Pop");
          }
         }
        
      }
      // return list;
      System.out.println(list);
  }

  public static boolean binarySearch(int[] arr,int target){
      int start = 0, end = arr.length-1;

      while(start <= end){
          int mid = start + (end - start)/2;
          if(target == arr[mid]){
              return true;
              // System.err.println(true);
          }
          if(target > arr[mid]){
              start = mid + 1;
          }
          else{
              end = mid - 1;
          }
      }
      return false;
      // System.out.println(false);
  }
}
