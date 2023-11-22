package ArrayList;

import java.util.ArrayList;

public class StringReverse {
  public static void main(String[] args) {
    String s = "code with siri";

    ArrayList<Character> list = new ArrayList<>();
    String str = "";
    for(int i=0;i<s.length();i++){
      list.add(0,s.charAt(i));
    }
    for(int j=0;j<list.size();j++){
      str += list.get(j);
    }
    System.out.println(list);
    System.out.println(str);

    // Converting above List to array using toArray()
    // method and storing it in an string array
    //String k[] = al.toArray(new String[al.size()]);
 
  }
}
