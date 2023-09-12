public class Palindrome {
  public static void main(String[] args) {
    String str = "abcdcba";
    System.out.println(isPalindrome(str));
  }

  static boolean isPalindrome(String string){
    if( string == null || string.length()==0){
      return true;
    }
    String str = string.toLowerCase();

    for(int i=0; i <= str.length()/2; i++){
      char start = str.charAt(i);
      char end = str.charAt(str.length() - 1 - i);

      if(start != end){
        return false;
      }
    }

     return true;
  }
}
