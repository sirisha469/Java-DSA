package CodeBlog;

public class StringReverse {
  public static void main(String[] args) {
    String s = "code with siri";
    String s1="";
    for(int i=s.length()-1;i>=0;i--){
      s1+=s.charAt(i);
    }
    System.out.println(s1);


    StringBuilder sb = new StringBuilder(s);
    sb.reverse();
    System.out.println(sb);

    String original = "Hello, World!";
        char[] charArray = original.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            // Swap characters at start and end indices
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            // Move indices towards the center
            start++;
            end--;
        }
        String reversed = new String(charArray);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

    char[] str = s.toCharArray();
    int len = str.length;
    for(int i=0,j=len-1;i<len/2;i++,j--){
      char temp = str[i];
      str[i] = str[j];
      str[j] = temp;
    }
    String r = new String(str);
    System.out.println(r);
  }
}
