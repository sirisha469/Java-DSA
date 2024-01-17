package Generics;

import java.util.Arrays;
import java.util.List;

public class WildCard {

  public static double sum(List<? extends Number> list){
    double sum=0;
    for(Number n:list){
      sum+=n.doubleValue();
    }
    return sum;
  }
  public static void main(String[] args) {
    List<Integer> l1 = Arrays.asList(10,20,30);
    System.out.println("Total sum: "+sum(l1));

    List<Double> l2 = Arrays.asList(2.5,6.7,10.2);
    System.out.println("Total sum: "+sum(l2));
  }
}
