package HashSet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorString {
  public static void main(String[] args) {
    
    Comparator<String> compareString = new Comparator<String>() {
      public int compare(String o1,String o2){
        return o1.compareTo(o2);
      }
    }; 

    Comparator<String> compareString1 = new Comparator<String>() {
      public int compare(String o1,String o2){
        return o2.compareTo(o1);
      }
    }; 

    String[] car = new String[]{"Volve","Audi","BMW","Honda"};

    Set<String> treeSet = new TreeSet<>(compareString);
    
    treeSet.addAll(Arrays.asList(car));
    System.out.println("Ascending order");
    for(String s:treeSet){
      System.out.println(s);
    }

    String[] car1 = new String[]{"Volve","Audi","BMW","Honda"};

    Set<String> treeSet1 = new TreeSet<>(compareString1);
    
    treeSet1.addAll(Arrays.asList(car1));
    System.out.println("Descending order");
    for(String s:treeSet1){
      System.out.println(s);
    }
  }
}
