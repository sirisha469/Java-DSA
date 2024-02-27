package Recursion.String;

import java.util.ArrayList;

public class SubSequence {
  public static void main(String[] args) {
    String s = "abc";
    subSequence("", s);
    System.out.println(subSeqRet("", s));
  }

  public static void subSequence(String ans,String s){
    if(s.isEmpty()){
      System.out.println(ans);
      return;
    }
    char ch = s.charAt(0);
    subSequence(ans+ch, s.substring(1));
    subSequence(ans, s.substring(1));

  }

  public static ArrayList<String> subSeqRet(String p,String up){
    if(up.isEmpty()){
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }

    char ch = up.charAt(0);
    ArrayList<String> left = subSeqRet(p + ch, up.substring(1));
    ArrayList<String> right = subSeqRet(p, up.substring(1));

    left.addAll(right);
    return left;
  }

}
