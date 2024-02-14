package Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamList {
  public static void main(String[] args) {
    ArrayList<String> stringList = new ArrayList<>();

    stringList.add("ONE");
    stringList.add("TWO");
    stringList.add("THREE");

    Stream<String> stream = stringList.stream();

    long count = stream.map( value -> {
      return value.toLowerCase();
    }).count();

    System.out.println(count);
  }
}
