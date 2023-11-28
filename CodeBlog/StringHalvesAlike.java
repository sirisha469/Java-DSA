package CodeBlog;

public class StringHalvesAlike {
  public static void main(String[] args) {
    String s = "book";
    System.out.println("String halves alike: "+halvesAreAlike(s));
  }

  // METHOD 1
  // public static boolean halvesAreAlike(String s) 
  // {
  //   int vowelCount=0;
  //   char[] chArray = s.toCharArray();
    
  //   for(int i=0; i<chArray.length/2; i++) 
  //     if(isVowel(chArray[i])) vowelCount++;
  //   for(int i=chArray.length/2; i<chArray.length; i++) 
  //     if(isVowel(chArray[i])) vowelCount--;
    
  //   return vowelCount==0;
  // }
    
  // public static boolean isVowel(char ch)
  // {
  //   return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
  // }

  //METHOD 2
  // public static boolean halvesAreAlike(String s) 
  // {
  //   int vowelCount=0;
  //   //char[] chArray = s.toCharArray();
    
  //   for(int i=0; i<s.length()/2; i++) 
  //     if(isVowel(s.charAt(i))) vowelCount++;
  //   for(int i=s.length()/2; i<s.length(); i++) 
  //     if(isVowel(s.charAt(i))) vowelCount--;
    
  //   return vowelCount==0;
  // }
  
  // public static boolean isVowel(char ch)
  // {
  //   return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
  // }

  //METHOD 3
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
