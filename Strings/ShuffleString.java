package Strings;

public class ShuffleString {
  public static void main(String[] args) {
    String s = "codeleet";
    int[] indices = {4,5,6,7,0,2,1,3};
    String ans = restoreString(s, indices);
    System.out.println(ans);
  }

  public static String restoreString(String s, int[] indices) {
    StringBuilder br=new StringBuilder();
    int len = indices.length;
    char[] c = new char[len];
    for(int i=0;i<len;i++){
        c[indices[i]] = s.charAt(i);
    }
    br.append(c);
    return br.toString();
  }
}
