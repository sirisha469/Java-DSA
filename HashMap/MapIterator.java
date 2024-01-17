package HashMap;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;


public class MapIterator {
  public static void main(String[] args) {
    
    HashMap<Integer,String> map = new HashMap<>();

    //hashmap allow null values 
    //hashtable not allow null values

    map.put(1,"a");
    map.put(2,"b");

    Set<Integer> s1 = map.keySet();
    Iterator<Integer> itr = s1.iterator();
    
    while(itr.hasNext()){
      System.out.println(itr.next());
    }

    
  }
}
