//https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
package Strings;

public class VowelsString {
  
  public static void main(String[] args) {
    String s="book";
    System.out.println(halvesAreAlike(s));
  }

  public static boolean halvesAreAlike(String s) {
        
    String vowels = "aeiouAEIOU";

    int half = s.length()/2, ans=0;

    for(int i=0, j=half; i<half; i++, j++){
        if(vowels.contains(s.charAt(i)+"")){
            ans++;
        }

        if(vowels.contains(s.charAt(j)+"")){
            ans--;
        }
    }

    return ans==0;
}
}
