//https://leetcode.com/problems/valid-palindrome/
package Strings;

public class ValidPalindrome {
  
  public static void main(String[] args) {
    
    String s = "A man, a plan, a canal: Panama";
    String s1 = "1b1";
    //System.out.println(s);

    System.out.println(isPalindrome(s));
    System.out.println(isPalindrome(s1));

    isPalindrome1(s1);
  }

  public static boolean isPalindrome(String s) {
        
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    int len = s.length();
    for(int i=0, j=len; i < len; i++, j--){
        if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))){
        sb1.append(s.charAt(i));
        }
        if(Character.isAlphabetic(s.charAt(j-1)) || Character.isDigit(s.charAt(j-1))){
        sb2.append(s.charAt(j-1));
        }
    }

    String s1 = sb1.toString().toLowerCase(),
    s2 = sb2.toString().toLowerCase();


    if(s1. equals(s2)){
      return true;
    }

    return false;

  }


  public static void isPalindrome1(String s){

    String str = s.toLowerCase().replaceAll("[^a-b0-9]", "");

    int len = str.length();
    boolean flag = true;

    for(int start = 0, end = len-1; start < len/2 ; start++, end--){
      char ch1 = str.charAt(start), ch2 = str.charAt(end);
      
      if(ch1 != ch2){
        flag = false;
      }

    }
    System.out.println("isPalindrome1: "+flag);
  }
}
