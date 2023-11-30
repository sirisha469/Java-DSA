package CodeBlog;

public class ValidPalindrome {
  public static void main(String[] args) {
    String s = "A man, a plan, a canal: Panama";
    System.out.println("Is valid palindrome: "+isPalindrome(s));

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
}
