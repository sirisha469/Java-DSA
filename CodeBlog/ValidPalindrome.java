package CodeBlog;

import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {
  public static void main(String[] args) {
    String s = "A man, a plan, a canal: Panama";
    System.out.println("Is valid palindrome: "+isPalindrome1(s));
  }

  public static boolean isPalindrome(String s) {
    int start =0,last =s.length()-1;
    while(start < last){
      char currFirst = s.charAt(start);
      char currLast = s.charAt(last);
      if (!Character.isLetterOrDigit(currFirst )) {
        start++;
      } else if(!Character.isLetterOrDigit(currLast)) {
        last--;
      }
      else 
      {
        if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
          return false;
        }
        start++;
        last--;
      }
    }
    return true;
  }

  public static boolean isPalindrome1(String s) {
    List<Character> list = new ArrayList<>();

    s = s.toLowerCase();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (Character.isLetterOrDigit(c)) {
        list.add(c);
      }
    }
    
    //2.check if Palindrome or not
    for (int i = 0; i < list.size() / 2; i++) {
      if (list.get(i) != list.get(list.size() - 1 - i)) {
        return false;
      }
    }

    return true;
  }
}
