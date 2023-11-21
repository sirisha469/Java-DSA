package CodeBlog;

public class ReverseWordString {
  public static void main(String[] args) {
    String s = "code with siri";

    rev(s, s.length()-1);
    //System.out.println("Input: "+s);
    //converting string to string array
    String[] str = s.split(" ");
    StringBuilder sb = new StringBuilder();
    int i=0;
    for(i=0;i<str.length-1;i++){
      sb.append(reverse(str[i])).append(" ");
    }
    if(i==str.length-1){
      sb.append(reverse(str[str.length-1]));
    }
    System.out.println("Output: "+sb);

    System.out.println(rever(s, s.length()-1));
  }

  public static String reverse(String s){
    String reverse = "";
    for(int i=s.length()-1;i>=0;i--){
      reverse+=s.charAt(i);
    }
    return reverse;
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
