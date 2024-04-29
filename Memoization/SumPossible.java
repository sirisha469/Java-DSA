package Memoization;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SumPossible {
  public static void main(String[] args) {
    int amount = 4;
    List<Integer> num = Arrays.asList(1,2,3);
    List<Integer> num1 = Arrays.asList(5,6,7);
    System.out.println(sumPossible(amount, num));
    System.out.println(sumPossible(amount, num1,new HashMap<>()));
  }

  //General recursion
  public static boolean sumPossible(int amount,List<Integer> numbers){
    if(amount==0){
      return true;
    }

    if(amount <0){
      return false;
    }

    for(int num:numbers){
      if(sumPossible(amount-num, numbers)){
        return true;
      }
    }

    return false;
  }

  //DP: Memoization
  public static boolean sumPossible(int amount,List<Integer> numbers,HashMap<Integer,Boolean> memo){
    if(amount==0){
      return true;
    }

    if(amount <0){
      return false;
    }

    if(memo.containsKey(amount)){
      return memo.get(amount);
    }

    for(int num:numbers){
      if(sumPossible(amount-num, numbers, memo)){
        memo.put(amount-num,true);
        return true;
      }
    }

    return false;
  }
}
