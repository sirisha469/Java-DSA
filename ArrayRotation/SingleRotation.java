package ArrayRotation;

import java.util.Arrays;

public class SingleRotation {
  public static void main(String[] args) {
    int[] a = {1,2,3,4,5};
    rotate(a);
    System.out.println(Arrays.toString(a));
  }

  static void rotate(int[] arr){
    int temp=arr[0];
    for(int i=1;i<arr.length;i++){
      arr[i-1] = arr[i];
    }
    arr[arr.length-1] = temp;
  }
}
