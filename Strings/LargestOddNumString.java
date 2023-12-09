//https://leetcode.com/problems/largest-odd-number-in-string/description/
package Strings;

public class LargestOddNumString {
  public static void main(String[] args) {
    String s = "42";
    System.out.println(largestOddNumber1(s));
  }

  public static String largestOddNumber(String num) {
    int n = num.charAt(num.length()-1);
    //n - '0' value is 48 %2==0
    //n - '1' value is 49 %2==1
    if(n%2==1) 
        return num;
    int i=num.length()-1;
    while(i>=0){
        int m=num.charAt(i);
        if(m%2==1) 
          return num.substring(0,i+1);
        i--;
    }
    return "";
  }

  public static String largestOddNumber1(String num) {
    int len = num.length();
    
    if(len>=0 && num.charAt(len-1)%2==1) 
      return num.substring(0,len);
    else{
      return largestOddNumber1(num.substring(0, len-1));
    }
  }
}
