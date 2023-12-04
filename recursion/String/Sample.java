package Recursion.String;

public class Sample {
  public static void main(String[] args) {
    //Remove 'a' from the string and print the output.
    String s = "baccdah";
    // skip("",s);
    System.out.println(skip1( s));
  }

  public static void skip(String ans,String s){
    if(s.isEmpty()){
      System.out.println(ans);
      return;
    }
    char ch=s.charAt(0);
    if(ch=='a'){
      skip(ans,s.substring(1));
    }else{
      skip(ans+ch,s.substring(1));
    }
  }

  public static String skip1(String s){
    if(s.isEmpty()){
      return "";
    }
    char ch=s.charAt(0);
    if(ch=='a'){
      return skip1(s.substring(1));
    }else{
      return ch+skip1(s.substring(1));
    }
  }
}
