//https://leetcode.com/problems/is-subsequence/description/

package Recursion;

public class IsSubsequence {
  public static void main(String[] args) {
    String s = "abc";
    String t = "ahbgdac";

    System.out.println(isSubsequence(s,t,0,0));
  }

  public static boolean isSubsequence(String s, String t, int i, int j){

    if(s.length() == i){
        return true;
    }

    if(s.length() > i && j == t.length())
        return false; 

    if(s.charAt(i) == t.charAt(j)){
        return isSubsequence(s, t, i+1, j+1);
    }
    return isSubsequence(s, t, i, j+1);
}

}
