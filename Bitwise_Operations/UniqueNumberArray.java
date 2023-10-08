package Bitwise_Operations;

public class UniqueNumberArray {
  public static void main(String[] args) {
    int[] arr = {2,3,3,4,2,4,6};
    //output unique = 6

    System.out.println(uniqueNumber(arr));
  }
  public static int uniqueNumber(int[] arr){
    int unique = 0;
    for(int n:arr){
      unique = unique ^ n;
    }
    return unique;
  }
}
