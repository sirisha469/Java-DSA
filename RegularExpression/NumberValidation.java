package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidation {
  public static void main(String[] args) {
    String s = "[89][0-9]{9}";
    String str = "9948226734";
    //type 1
    boolean ans = Pattern.matches(s, str);
    System.out.println(ans);

    //type 2
    Pattern p = Pattern.compile(s);
    Matcher m = p.matcher(str);
    boolean answer = m.matches();
    System.out.println(answer);

    //type 3
    boolean res = Pattern.compile(s).matcher(str).matches();
    System.out.println(res);
  }
}
