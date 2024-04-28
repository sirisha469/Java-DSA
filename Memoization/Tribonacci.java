package Memoization;

import java.util.HashMap;

public class Tribonacci {
  public static void main(String[] args) {
    System.out.println(tribonacci(4));
    System.out.println(tribonacci(4,new HashMap<Integer,Integer>()));
  }

  public static int tribonacci(int n){
    if(n==0 || n==1){
      return 0;
    }
    if(n==2){
      return 1;
    }

    return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
  }

  //memoization
  public static int tribonacci(int n, HashMap<Integer,Integer> memo){
    if(n==0 || n==1){
      return 0;
    }
    if(n==2){
      return 1;
    }

    if(memo.containsKey(n)){
      return memo.get(n);
    }

    int result = tribonacci(n-1,memo) + tribonacci(n-2, memo) + tribonacci(n-3,memo);
    memo.put(n,result);
    return result;
  }
}
