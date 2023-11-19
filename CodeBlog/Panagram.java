package CodeBlog;

import java.util.HashMap;
import java.util.HashSet;

import HashMap.Map;

public class Panagram {
  public static void main(String[] args) {
    String s = "abcdefghijklmnopqrstuvwxyz";
    
    int[] arr = new int[26];

    for(char ch:s.toCharArray()){
      arr[ch-'a'] = 1;
    }

    boolean ans=false;
    for(int i:arr){
      if(i==0){
        ans = false;
        break;
      }
      else{
        ans = true;
      }
    }

    System.out.println("Panagram: "+ans);



    HashMap<Character,Integer> map=new HashMap<>();

    for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),1);
    }

    if(map.size() == 26){
        System.out.println("Pangram: "+true);
    }
    else{
      System.err.println("Pangram: "+false);
    }


    HashSet <Character> a=new HashSet<>();            
    if(s.length()>25)
    {
      for(int i=0;i<s.length();i++)
      {
        a.add(s.charAt(i));
      }        
    }
    boolean res = a.size()==26 ? true : false;
    System.out.println("Pangram: "+res);
        
  }
}
