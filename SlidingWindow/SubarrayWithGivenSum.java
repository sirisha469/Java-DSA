//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&category%5B%5D=Arrays&sortBy=submissions
package SlidingWindow;
import java.util.ArrayList;

public class SubarrayWithGivenSum{
  public static void main(String[] args) {
    
  }
  
  static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
  {
    int start=0,end=0,prefixSum=0;
    ArrayList<Integer> list = new ArrayList<>();
    while(end<n){
      prefixSum+=arr[end];
      
      while(prefixSum>s && start<end){
        prefixSum -= arr[start];
        start++;
      }
      
      if(prefixSum == s){
        list.add(start+1);
        list.add(end+1);
        return list;
      }
      end++;
    }
    list.add(-1);
    return list;
      
  }
}