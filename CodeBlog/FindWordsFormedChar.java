package CodeBlog;

public class FindWordsFormedChar {
  public static void main(String[] args) {
    String[] words = {"cat","bt","hat","tree"};
    String chars = "atach";
    System.out.println("Words length: "+countCharacters(words, chars));
  }

  public static int countCharacters(String[] words, String chars) {
    int[] charsArr = new int[26];

    for(int i=0;i<chars.length();i++){
      charsArr[chars.charAt(i)-'a']++;
    }
    int sum=0;
    for(String s:words){
      if(check(s,charsArr)){
        sum+=s.length();
      }
    }
    return sum;
  }

  public static boolean check(String s,int[] charsArr){
    int[] wordArr = new int[26];

    for(int i=0;i<s.length();i++){
      int m = s.charAt(i)-'a';
      wordArr[m]++;
      if(wordArr[m] > charsArr[m]){
        return false;
      }
    }
    return true;
  }
}
