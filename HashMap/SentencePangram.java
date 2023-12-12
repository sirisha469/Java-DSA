package HashMap;

import java.util.HashMap;

public class SentencePangram {
  public static void main(String[] args) {
    String s = "abcdefghijklmnopqrstuvwxyz";
    boolean ans = pangram(s);
    System.out.println(ans);

    pangram2(s);
  }

  //first method
  public static boolean pangram(String s){
    HashMap<Character,Integer> map=new HashMap<>();

    for(int i=0;i<s.length();i++){
      map.put(s.charAt(i),1);
    }

    if(map.size() == 26){
      return true;
    }
    return false;
  }

  //second simple method
  public static void pangram2(String s){
    long count = s.chars().distinct().count();
    System.out.println(count);

    if(count == 26){
      System.out.println(true);
    }
    else{
      System.out.println(false);
    }
  }
}
