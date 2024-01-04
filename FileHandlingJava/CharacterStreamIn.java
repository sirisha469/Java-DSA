package FileHandlingJava;

import java.io.FileReader;
import java.io.IOException;

public class CharacterStreamIn {
  public static void main(String[] args) throws IOException{
    FileReader fileRead = null;

    try{
      fileRead = new FileReader("C:/Users/chsir/Desktop/desktop/Important/outStream.txt");

      int i;
      while((i=fileRead.read())!=-1){
        System.out.print((char)i);
      }
    }
    finally{
      fileRead.close();
    }
  }
}
