package ArrayRotation;

import java.util.Arrays;

public class RotateKTimes {
  public static void main(String[] args) {
    int[] a={1,2,3,4,5};
    rotate(a, 2);
    System.out.println(Arrays.toString(a));
  }

  static void rotate(int[] arr,int k){
    //Here k values is greater then length of the array then do mod operation (k%len)
    //if the k value is less than 0 or negative number then do k+len
    int len = arr.length;
    k = k%len;
    if(k < 0){
      k = k+len;
    }

    for(int i=0;i<k;i++){
      rotateONE(arr);
    }
  }

  static void rotateONE(int[] arr){
    int temp = arr[0];
    for(int i=1;i<arr.length;i++){
      arr[i-1] = arr[i];
    }
    arr[arr.length-1] = temp;
  }
}
