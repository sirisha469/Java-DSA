package FileHandlingJava;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileScanner {
  public static void main(String[] args) throws IOException {
    Scanner sc = null;

    try{
      sc = new Scanner(new FileReader("C:/Users/chsir/Desktop/desktop/Important/outcopy_characterstream.txt"));

      while (sc.hasNext()) {
        System.out.println(sc.next());//it print word
        //System.out.println(sc.nextLine());//it print entire line
      }
    }
    finally{
      sc.close();
    }
  }
}
