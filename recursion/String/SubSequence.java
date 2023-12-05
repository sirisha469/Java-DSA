package Recursion.String;
public class SubSequence {
  public static void main(String[] args) {
    String s = "abc";
    subSequence("", s);
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

}
