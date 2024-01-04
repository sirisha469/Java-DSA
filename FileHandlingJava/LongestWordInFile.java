package FileHandlingJava;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LongestWordInFile {
  public static void main(String[] args) throws IOException{
    Scanner sc = null;

    try{
      sc = new Scanner(new FileReader("C:/Users/chsir/Desktop/desktop/Important/out_characterstream.txt"));

      int len =0;
      String s = "";
      while(sc.hasNext()){
        String str = sc.next();
        int count = str.length();
        if(len<count){
          len=count;
          s = str;
        }
      }
      System.out.println(s);
    }
    finally{
      sc.close();
    }
  }
}
