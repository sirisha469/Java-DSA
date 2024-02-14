package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(10,11,12,13);

    List<Integer> squares = list.stream().map(x->x*x).collect(Collectors.toList());

    System.out.println(squares);
    
  }
}
