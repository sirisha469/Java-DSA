package CodeBlog;

public class SortingSentence {
  public static void main(String[] args) {
    String s = "is2 sentence4 This1 a3";
    String[] str = s.split(" ");
    int len = str.length;
    String[] result = new String[len];
    StringBuilder sb = new StringBuilder();
    int index =0;
    for(String string:str){
      int l = string.length();
      index = (int)(string.charAt(l-1)-'0');
      result[index-1] = string.substring(0, l-1);
    }

    for(int i=0; i<result.length-1; i++){
      sb.append(result[i]).append(" ");
    }
    sb.append(result[result.length-1]);

    System.out.println(sb.toString());
  }
}
