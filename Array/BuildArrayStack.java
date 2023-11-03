//https://leetcode.com/problems/build-an-array-with-stack-operations/?envType=daily-question&envId=2023-11-03
package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class BuildArrayStack {
  public static void main(String[] args) {
    int[] arr = {1,2};
    int n = 2;
    System.out.println(buildArray(arr, n));
    // buildArray2(arr, n);
    // System.out.println(binarySearch(arr, n));

  }
  public static List<String> buildArray(int[] target, int n) {
      List<String> list = new ArrayList<>();
      int[] val = new int[1];
      for(int i=1;i<=n;i++){
        val[0]=i;
        boolean isValueInArray = IntStream.of(target).anyMatch(x -> x == val[0]);//IntStream should be final value val[0] is final
        if(isValueInArray){
          list.add("Push");
        }
        else{
          if(val[0]-1 == target[target.length-1]){
            break;
          }
          else{
            list.add("Push");
            list.add("Pop");
          }
        }
      }
      return list;
    }

    
}
