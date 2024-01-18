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


//Notes
//checking both maps are equal
// if(!mapA.entrySet().containsAll(mapB.entrySet())) {
//   System.out.println("Not Anagrams");
// } 
// else {
//   System.out.println("Anagrams");
// }

//adding data to the map
// if(!map.containsKey( lowerCaseStr. charAt(i))) {
//   map.put(lowerCaseStr.charAt(i),1);
// } 
// else {
//   map.put(lowerCaseStr.charAt(i),map.get(lowerCaseStr.charAt(i)) + 1);
// }
