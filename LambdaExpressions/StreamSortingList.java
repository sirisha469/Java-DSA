package LambdaExpressions;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamSortingList {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(105,112,95,375,303);

    Collections.sort(list, (o1,o2) -> (o1>o2)?-1:(o1<o2)?1:0);

    System.out.println("After sorting: "+list);
  }
}
