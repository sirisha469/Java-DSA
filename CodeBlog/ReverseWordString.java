package CodeBlog;

public class ReverseWordString {
  public static void main(String[] args) {
    String s = "code with siri";
    System.out.println("Input: "+s);
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
  }

  public static String reverse(String s){
    String reverse = "";
    for(int i=s.length()-1;i>=0;i--){
      reverse+=s.charAt(i);
    }
    return reverse;
  }
}
