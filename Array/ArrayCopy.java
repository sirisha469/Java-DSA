package Array;

import java.util.Arrays;

public class ArrayCopy {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    int[] a = new int[5];
    //System.arraycopy(source_array, sourc_index, destination_array, destination_start_index,destination_end_index);
    System.arraycopy(arr,3,a,0,2);
    System.out.println(Arrays.toString(a));
  }
}
