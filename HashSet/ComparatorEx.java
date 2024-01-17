package HashSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class ComparatorEx {
  public static void main(String[] args) {
    SortedSet<String> set = new TreeSet<>();

    set.add("A");
    set.add("E");
    set.add("I");
    set.add("O");
    set.add("U");

    System.out.println("Vowels are: "+set);

    //predefined methods in sortedset
    System.out.println("First vowel: "+set.first());
    System.out.println("Last vowel: "+set.last());

    System.out.println();

    System.out.println("Vowels which come before I: "+set.headSet("I"));
    System.out.println("Vowels which come after I(includes I): "+set.tailSet("I"));

    System.out.println();

    System.out.println("Vowels which comes between E and U (including E): "+set.subSet("E","U"));

  }
}
