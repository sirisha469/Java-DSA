package CodeBlog;
import java.util.Arrays;

public class LogestCommonPrefix {
  public static void main(String[] args) {
    String[] strs = {"flower","flow","flight"};
    System.out.println(Arrays.toString(strs));
    System.out.println("Common prefix: "+longestCommonPrefix(strs));
    int len = strs.length;
    String answer="";
    if(len==1){
        answer = strs[0];
    }
    Arrays.sort(strs);

    int minValue = Math.min(strs[0].length(), strs[len-1].length());
    int i=0;
    while(i<minValue && strs[0].charAt(i) == strs[len-1].charAt(i)){
        i++;

    }
    answer = strs[0].substring(0,i);
    System.out.println("Common prefix: "+answer);
  }

  public static String longestCommonPrefix(String[] strs) 
  {
    int len = strs.length;
    if(len==0){
        return "";
    }
    if(len==1){
        return strs[0];
    }
    Arrays.sort(strs);

    int minValue = Math.min(strs[0].length(), strs[len-1].length());
    int i=0;
    while(i<minValue && strs[0].charAt(i) == strs[len-1].charAt(i)){
        i++;

    }
    String str = strs[0].substring(0,i);
    return str;     
  } 
}
