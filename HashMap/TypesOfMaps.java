package HashMap;

import java.util.*;
import java.util.Map.Entry;

public class TypesOfMaps {
  public static void main(String[] args) {
    
    HashMap<Integer,String> map1 = new HashMap<>();
    map1.put(10,"siri");
    map1.put(8,"Naga");
    map1.put(15,"Yashu");
    map1.put(6,"Dhaanvi");

    System.out.println("Hash set (random order)");
    for(Entry<Integer, String> m:map1.entrySet())
      System.out.println(m.getKey()+" "+m.getValue());

    //LinkedHashMap: linked hash map is stored the key values in insertion order
    HashMap<Integer,String> map2 = new LinkedHashMap<>();
    map2.put(10,"siri");
    map2.put(8,"Naga");
    map2.put(15,"Yashu");
    map2.put(6,"Dhaanvi");
    System.out.println("Linked hash map: Insertion order");

    for(Entry<Integer, String> m:map2.entrySet())
      System.out.println(m.getKey()+" "+m.getValue());

    //Tree Map: It store the values in alphabetical order ascending order
    java.util.Map<Integer,String> map3 = new TreeMap<>();
    map3.put(10,"siri");
    map3.put(8,"Naga");
    map3.put(15,"Yashu");
    map3.put(6,"Dhaanvi");
    System.out.println("Linked hash map: Insertion order");

    for(Entry<Integer, String> m:map3.entrySet())
      System.out.println(m.getKey()+" "+m.getValue());
    
  }
}
