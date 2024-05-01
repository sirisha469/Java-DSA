package Memoization;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SumPossibleSmallestPath {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3);
    System.out.println(minChange(4,list));
    System.out.println(minChange(4,list, new HashMap<>()));
  }

  public static int minChange(int amount,List<Integer> coins){
    if(amount==0){
      return 0;
    }

     if(amount<0){
      return -1;
     }

     int minCoins = -1;
     for(int coin:coins){
      int subAmount = amount - coin;
      int subCoins = minChange(subAmount,coins);
      if(subCoins != -1){
        int numCoins = subCoins + 1;
        if(numCoins < minCoins || minCoins==-1){
          minCoins = numCoins;
        }
      }
     }

     return minCoins;
  }

  //Memoization
  public static int minChange(int amount,List<Integer> coins, HashMap<Integer,Integer> memo){
    if(amount==0){
      return 0;
    }

     if(amount<0){
      return -1;
     }

     if(memo.containsKey(amount)){
      return memo.get(amount);
     }

     int minCoins = -1;
     for(int coin:coins){
      int subAmount = amount - coin;
      int subCoins = minChange(subAmount,coins);
      if(subCoins != -1){
        int numCoins = subCoins + 1;
        if(numCoins < minCoins || minCoins==-1){
          minCoins = numCoins;
        }
      }
     }

     memo.put(amount,minCoins);
     return minCoins;
  }
}
