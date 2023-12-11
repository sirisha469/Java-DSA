package HashSet;

import java.util.HashSet;

public class SubarrayZeroSum {
  public static void main(String[] args) {
    int[] arr = {4,2,-3,1,5};
    int n=5;
    System.out.println(findSum2(arr, n));
  }

  static boolean findSum2(int[] arr,int n){
    HashSet<Integer> set = new HashSet<>();
    int sum=0;
    set.add(0);
    for(int i=0;i<n;i++){
      sum+=arr[i];
      if(set.contains(sum)){
        return true;
      }
      set.add(sum);
    }
    return false;
  }

  static boolean findSum(int arr[],int n)
  {
    for(int i=0; i<n; i++){
      int sum=0;
      for(int j=i; j<n; j++){
        sum += arr[j];
        if(sum==0) 
          return true;
      }
    }
    return false;
  }
}
