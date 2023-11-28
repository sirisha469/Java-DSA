package CodeBlog;

public class Vowel {
  public static void main(String[] args) {
    char ch ='e';

    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
      System.out.println("vowel");
    }
    else{
      System.out.println("Not a vowel");
    }

    vowel(ch);
    vowel1(ch);
  }

  public static void vowel(char ch){
    String vowels = "aeiouAEIOU";

    if(vowels.contains(ch+"")){
      System.out.println("vowel");
    }
    else{
      System.out.println("Not a vowel");
    }
  }

  public static void vowel1(char ch){
    String vowels = "aeiouAEIOU";

    if(vowels.indexOf(ch) != -1){
      System.out.println("vowel");
    }
    else{
      System.out.println("Not a vowel");
    }
  }

}
