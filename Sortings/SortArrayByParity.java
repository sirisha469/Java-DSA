//https://leetcode.com/problems/sort-array-by-parity/
package Sortings;
import java.util.Arrays;

public class SortArrayByParity {
  public static void main(String[] args) {
    int[] arr = {5,3,4,1,2};
    sortByParity(arr);
    System.out.println(Arrays.toString(arr));
  }

  //move even numbers to beginning of array followed by odd numbers
  public static void sortByParity(int[] arr){

    for(int i=0,j=0;j<arr.length; j++){
      if(arr[j]%2 ==0){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
      }
    }

    System.out.println(Arrays.toString(arr));

  }
}
