package Permutation;

import java.util.ArrayList;

public class PermutationsList {
  public static void main(String[] args) {
    ArrayList<String> ans = permutationsList("", "abc");
    System.out.println(ans);
  }

  static ArrayList<String> permutationsList(String p,String up){
    if(up.isEmpty()){
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }

    char ch = up.charAt(0);
    ArrayList<String> ans = new ArrayList<>();
    for(int i=0;i<=p.length();i++){
      String f = p.substring(0, i);
      String s = p.substring(i,p.length());
      ans.addAll(permutationsList(f+ch+s, up.substring(1)));
    }
    return ans;
  } 
}
