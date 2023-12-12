package RegularExpression;

public class StringTokens {
  public static void main(String[] args) {
    //print all in separate line ignoring . , ! _ - @ space
    String s = "He is a very very good boy, isn't he?";
    String[] str = s.trim().split("[,'._!@? ]+");
    for(int i=0;i<str.length;i++){
      System.out.println(str[i]);
    }

    // output
    // He
    // is
    // a
    // very
    // very
    // good
    // boy
    // isn
    // t
    // he

  }
}
