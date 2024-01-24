package LambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class SearchAndMatch {
  public static void main(String[] args) {
    List<Integer> list =Arrays.asList(30,50,70,90,110);

    boolean out1 = list.stream().anyMatch(n -> (n * (n + 1))/4 == 5);
    System.out.println("output 1: "+out1);

    boolean out2 = list.stream().allMatch(n -> n%2 == 0);
    System.out.println("output 2: "+out2);

    boolean out3 = list.stream().noneMatch(n -> n<0);
    System.out.println("output 3: "+out3);

  }
}
