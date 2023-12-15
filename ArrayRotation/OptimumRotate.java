package ArrayRotation;

import java.util.Arrays;

public class OptimumRotate {
  public static void main(String[] args) {
    int[] a = {1,2,3,4,5,6,7};
    rotate(a,3);
    System.out.println(Arrays.toString(a));
  }

  static void rotate(int[] a,int k){
    int len = a.length;
    k = k%len;
    if(k<0){
      k = k+len;
    }
    reverse(a,0,k-1);
    reverse(a,k,len-1);
    reverse(a,0,len-1);
  }

  static void reverse(int[] a, int start, int end) {
    while(start<end){
      int temp = a[start];
      a[start] = a[end];
      a[end] = temp;
      start++;
      end--;
    }
  }
}
