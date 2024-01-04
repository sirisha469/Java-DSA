package FileHandlingJava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendTextExistingFile {
  public static void main(String[] args) throws IOException{
    FileWriter fr = new FileWriter("C:/Users/chsir/Desktop/desktop/Important/exam.txt");
    String extraData = "\n appending text to the exisiting file\n";
    
    try(BufferedWriter bw = new BufferedWriter(fr)){
      
      bw.write(extraData);
      System.out.println("Successfully append text");
    }
    finally{
      fr.close();
    }
  }
}
