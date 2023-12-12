package RegularExpression;

import java.util.regex.Pattern;

public class EmailValidation {
  public static void main(String[] args) {
    String s = "[a-zA-Z0-9_\\.\\-]+[@][a-z]+[\\.][a-z]{3,5}";
    String str = "Siri123@gmail.com";
    System.out.println(Pattern.matches(s, str));

    String str2 = "Siri@gmail.com";
    String p = "[a-zA-Z\\.\\-_]+[0-9]*[@][a-z]+[\\.][a-z]{3,5}";
    System.out.println(Pattern.matches(p, str2));
  }
}
