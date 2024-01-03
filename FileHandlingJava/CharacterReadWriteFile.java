package FileHandlingJava;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterReadWriteFile {
  public static void main(String[] args) throws IOException{
    FileReader fileReadIn = null;
    FileWriter fileWriteOut = null;

    try{
      fileReadIn = new FileReader("C:/Users/chsir/Desktop/desktop/Important/out_characterstream.txt");

      fileWriteOut = new FileWriter("C:/Users/chsir/Desktop/desktop/Important/outcopy_characterstream.txt");

      int i;
      while((i=fileReadIn.read())!=-1){
        fileWriteOut.write(i);
      }
    }
    finally{
      fileReadIn.close();
      fileWriteOut.close();
    }
    
  }
}
