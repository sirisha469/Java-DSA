package Memoization;

import java.util.HashMap;

public class Fibonacci {
  public static void main(String[] args) {
    System.out.println(fib(4));
    System.out.println(fib(4,new HashMap<Integer,Integer>()));
  }

  //General recursion
  public static int fib(int n){
    if(n==0 || n==1){
      return n;
    }
    return fib(n-1) + fib(n-2);
  }

  //Recursion with memoization
  public static int fib(int n,HashMap<Integer,Integer> memo){
    if(n==1 || n==0){
      return n;
    }

    if(memo.containsKey(n)){
      return memo.get(n);
    }

    int result = fib(n-1,memo) + fib(n-2,memo);
    memo.put(n,result);
    return result;
  }
}
