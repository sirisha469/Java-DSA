package CodeBlog;

public class StringArrayEquivalent {
  public static void main(String[] args) {
    String[] word1 = {"ab", "c"};
    String[] word2 = {"a", "bc"};

    boolean answer = arrayStringsAreEqual(word1, word2);
    System.out.println("Both String arrays are equivalent: "+answer);
  }

  public static boolean arrayStringsAreEqual(String[] word1, String[] word2) 
  {
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();

    for(String s:word1){
      sb1.append(s);
    }
    for(String s:word2){
      sb2.append(s);
    }
    if((sb1.toString().equals(sb2.toString()))){
      return true;
    }
    return false;
  }

  
}
