package Recursion;

public class StringReverse {
  public static void main(String[] args) {
    String s = "siri";
    rev(s,s.length()-1);
    System.out.println();
    System.out.println(rever(s, s.length()-1));
  }

  public static void rev(String s,int len){
    if(len ==-1){
      return;
    }
    String str = "";
    str = str + s.charAt(len);

    System.out.print(str);
    rev(s,len-1);
  }

  public static String rever(String s,int len){
    if(len ==-1){
      return "";
    }
    // String str = "";
    // str = str + s.charAt(len);

    return s.charAt(len) + rever(s,len-1); 
  }
}
