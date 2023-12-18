package HCLAssignment3;

import java.util.Scanner;

public class StringConcept {
  static void stringequality(String s1,String s2){
    System.out.print("String equality: ");
    if(s1.equals(s2)){
      System.out.println("Both strings are equal");
    }
    else{
      System.out.println("Strings are not equal");
    }
  }

  static void concatenateString(String s1,String s2){
    s1 = s1.concat(s2);
    System.out.println("Concatenation:"+s1);
  }

  static void stringLength(String s){
    System.out.println("String length: "+s.length());
  }

  static void stringReplace(String s){
    s = s.replace("l", "z");
    System.out.println("String Replace: "+s);
  }

  static void stringUpper(String s){
    System.out.println(s.toUpperCase());
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    String s2 = sc.next();
    stringequality(s1, s2);
    concatenateString(s1, s2);
    stringLength(s1);
    stringReplace(s1);
    stringUpper(s1);
    sc.close();
  }
}
