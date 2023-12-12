package RegularExpression;

import java.util.regex.Pattern;

public class IpAddressValidation {
  public static void main(String[] args) {
    //Ip address range 0-255
    // Example 000.12.12.034
    // 121.234.12.12
    // 23.45.12.56

    //way 1
    String regex = "([01]?[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    String pattern = regex+"\\."+regex+"\\."+regex+"\\."+regex;
    String s = "000.12.12.034";
    System.out.println(Pattern.matches(pattern,s));

    //way 2
    String p = "(([01]?[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([01]?[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    System.out.println(Pattern.matches(p, s));
  }
}
