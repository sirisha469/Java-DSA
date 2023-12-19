package HCLAssignment3;

import java.util.Scanner;

public class WordCount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your text (Press Ctrl+D or Ctrl+Z to end input):");
    StringBuilder br = new StringBuilder();
    while(sc.hasNextLine()){
      br.append(sc.nextLine()).append("\n");
    }
    System.out.println(br.toString());
    String s = br.toString();
    int characterCount = characterCount(s);
    int wordCount = wordCount(s);
    int lineCount = lineCount(s);
    System.out.println("Character count:"+characterCount);
    System.out.println("Word count:"+wordCount);
    System.out.println("Line count:"+lineCount);
    sc.close();
  }

  static int characterCount(String s){
    return s.length();
  }

  static int wordCount(String s){
    String[] word = s.split("\\s");
    return word.length;
  }

  static int lineCount(String s){
    String[] line = s.split("\n");
    return line.length;
  }
}
