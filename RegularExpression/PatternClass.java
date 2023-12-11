package RegularExpression;

import java.util.regex.Pattern;

public class PatternClass {
  public static void main(String[] args) {
    boolean ans = Pattern.matches("s", "s");
    System.out.println(ans);

    System.out.println(Pattern.matches(".s", "as")); //dot represent one character
    System.out.println(Pattern.matches("..s", "mas"));
    System.out.println(Pattern.matches(".s", "msa"));//false because after s one more character
    System.out.println(Pattern.matches(".s.", "msa"));//true .s.

  }
}
