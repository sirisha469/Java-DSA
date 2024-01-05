package FileHandlingJava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendTextExistingFile {
  public static void main(String[] args) throws IOException{
    String extraData = "new text to the exisiting file\n";
    String fileName = "C:/Users/chsir/Desktop/desktop/Important/out_characterstream.txt";
    BufferedWriter writer = null;
    FileWriter file = new FileWriter(fileName,true);
    
    try{
      writer = new BufferedWriter(file); 
      writer.write(extraData);
      System.out.println("Successfully append text");
      writer.close();
    }
    finally{
      writer.close();
    }
  }
}
