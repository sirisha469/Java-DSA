package Bitwise_Operations;

public class MissingNumbetArray {
  public static void main(String[] args) {
    int n=5;
    int[] arr = {1,2,3,5};
    System.out.println(missingNumber(arr,n));
  }

  static int missingNumber(int array[], int n) {
       
    int sum_Arr = 0;
    
    for(int i:array){
      sum_Arr ^= i;
    }
    
    int num_Range=0;
    for(int j=1;j<=n;j++){
      num_Range ^= j;
    }
    
    return num_Range^sum_Arr;
  }
}
