package Strings;

public class CapitalizeFirstChar {
  public static void main(String[] args) {
    String s = "siri";

    String ans = s.substring(0,1).toUpperCase() + s.substring(1);
    System.out.println(ans);
  }
}
