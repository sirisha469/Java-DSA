//https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
package Upcoming_Blog;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxSumSubArrK {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(400,100,300,500));
    int n = 4, K = 2;
    System.out.println("Maximum sum of subarray: "+maximumSumSubarray(K, arr, n));
  }

  static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
    long initialSum=0;
    for(int i=0;i<K;i++){
      initialSum+=Arr.get(i);
    }
    
    long maxSum = initialSum;
    
    for(int i=K;i<N;i++){
      initialSum=initialSum-Arr.get(i-K)+Arr.get(i);
      maxSum = Math.max(maxSum,initialSum);
    }
    
    return maxSum;
  }
}
