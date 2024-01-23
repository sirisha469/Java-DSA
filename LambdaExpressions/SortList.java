package LambdaExpressions;

import java.util.ArrayList;

public class SortList {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(9);
    list.add(15);
    list.add(30);

    //Lambda expression
    //Approach 1
    list.stream().sorted().forEach(l ->{ 
      System.out.println(l);
    });

    //Approach 2
    //Method reference
    list.stream().sorted().forEach(System.out::println);
  }
}
