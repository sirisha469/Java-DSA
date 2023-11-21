package CodeBlog;
public class ShuffleString {
  public static void main(String[] args) {
    String s = "codeleet";
    int[] indices = {4,5,6,7,0,2,1,3};

    // StringBuilder br=new StringBuilder();
    int len = indices.length;
    char[] c = new char[len];
    for(int i=0;i<len;i++){
        c[indices[i]] = s.charAt(i);
    }
    // br.append(c);
    // System.out.println(br);

    String str = new String(c);
    System.out.println(str);
    System.out.println(new String(c));

  }
}
