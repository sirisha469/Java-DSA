package HashSet;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//LinkedHashSet: linked hash set insert the elements in adding order
public class OrderSet {
  public static void main(String[] args) {
    
    String[] s = new String[]{"BMW","Audi","Volve","Honda","Mercedes"};

    //LinkedHashSet
    Set<String> set1 = new LinkedHashSet<>(Arrays.asList(s));
    System.out.println("Linked Hash Set: ");
    for(String i:set1){
      System.out.println(i);
    }

    //TreeSet: It will store the values in the alphabetical order or lexographical order
    //It will not allow null values
    Set<String> set2 = new TreeSet<>(Arrays.asList(s));
    System.out.println("Tree set order: ");
    for(String i:set2){
      System.out.println(i);
    }
  }
}
