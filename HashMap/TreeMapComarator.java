package HashMap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapComarator {
 public static void main(String[] args) {
  Comparator<Integer> descendingComparator = new Comparator<Integer>() {
    public int compare(Integer i1,Integer i2){
      return i1.compareTo(i2) * -1;
    }
  };

  SortedMap<Integer,String> treeMap = new TreeMap<>(descendingComparator);

  treeMap.put(101,"Back to the future");
  treeMap.put(105,"Titanic");
  treeMap.put(102,"Jaws");
  treeMap.put(109,"Forrest Gump");

  System.out.println("Entries in the reverse order: ");

  for(Entry<Integer,String> m:treeMap.entrySet()){
    System.out.println(m);
  }
 } 
}
