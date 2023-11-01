package HashMap;

import java.util.HashMap;
public class Map {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
    String s="siri";
          
    HashMap<Character,Integer> map = new HashMap<>();
          
    for(int i=0;i<s.length();i++){
      map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
    } 
          
    System.out.println(map);

    //for array of numbers
    int[] position = {2,2,2,3,3};
    HashMap<Integer, Integer> map1 = new HashMap<>();
    for(int i=0;i<position.length;i++){
        map1.put(position[i], map1.getOrDefault(position[i],0) + 1);
    }
    System.out.println(map1);
  }

}
