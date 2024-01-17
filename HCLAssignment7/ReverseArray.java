package HCLAssignment7;

import java.util.Arrays;
public class ReverseArray {
  public static void main(String[] args) {
    
    int[] arr = {1,2,3};
    System.out.println(Arrays.toString(arr));
    for(int i=0;i<arr.length/2;i++){
      int temp = arr[i];
      arr[i] = arr[arr.length-i-1];
      arr[arr.length-i-1] = temp;
    } 

    System.out.println("Afetr reverse: "+Arrays.toString(arr));
  }
}
