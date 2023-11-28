package CodeBlog;

public class ReversePrefixWord {
  public static void main(String[] args) {
    String s = "abcdefxy";
    char ch = 'd';
    System.out.println(s.indexOf(ch));
    System.out.println("Original String: "+s);
    System.out.println("After reversing prefix: "+reversePrefix2(s,ch));
  }

  public static String reversePrefix(String word, char ch) {
        
    int i = word.indexOf(ch);
    StringBuilder sb = new StringBuilder();
    if(i < 0){
      return word;
    }
    else{
      sb.append(word, 0, i+1);
    }

    sb.reverse();
    sb.append(word,i+1, word.length());

    return sb.toString();
  }

  public static String reversePrefix1(String s,char ch){
    int right = s.indexOf(ch);

    StringBuilder sb = new StringBuilder(s);
    int left=0;

    while(left<right){
      sb.setCharAt(left, s.charAt(right));
      sb.setCharAt(right, s.charAt(left));
      left++;
      right--;
    }

    return sb.toString();
  }

  public static String reversePrefix2(String word, char ch) {
    int x=word.indexOf(ch);
    return reverse(word,x);
  }

  public static String reverse(String s,int k){
    char[] c = s.toCharArray();
    for(int i=0,j=k;i<(k+1)/2;i++,j--){
        char temp=c[i];
        c[i]=c[j];
        c[j]=temp;
    }
    return new String(c);
  }
}
