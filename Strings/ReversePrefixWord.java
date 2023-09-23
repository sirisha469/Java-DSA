package Strings;

public class ReversePrefixWord {
    public static void main(String[] args) {
      System.out.println(reversePrefix("abcdefg", 'd'));
      String s = "strcd";
      StringBuilder br = new StringBuilder();
      br.append(s,0,2);
      br.reverse();
      System.out.println(br.append(s,2,5));

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

        sb.reverse().append(word, i+1,word.length());


        return sb.toString();

    }
}

