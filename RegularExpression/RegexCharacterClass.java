package RegularExpression;

import java.util.regex.Pattern;

public class RegexCharacterClass {
  public static void main(String[] args) {
    System.out.println(Pattern.matches("[abc]", "a"));
    System.out.println(Pattern.matches("[^abc]", "s"));
    System.out.println(Pattern.matches("[a-zA-Z]", "S"));
  }
}
