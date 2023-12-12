package RegularExpression;

import java.util.regex.Pattern;

public class UsernameValidation {
  public static void main(String[] args) {
    //First character uppercase, contains lowercase, only one digit allowed in betewwn.
    String p = "[A-Z][a-z]*[0-9][a-z]*";
    String str = "Siri8";
    System.out.println(Pattern.matches(p,str));
  }
}
