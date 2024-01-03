package FileHandlingJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {
  public static void main(String[] args) throws IOException{
    FileInputStream fileIn = null;
    FileOutputStream fileOut = null;

    try{
      fileIn = new FileInputStream("C:/Users/chsir/Desktop/desktop/Important/1. What is JIT Compiler.txt");

      fileOut = new FileOutputStream("C:/Users/chsir/Desktop/desktop/Important/outStream.txt");

      int i;
      while((i=fileIn.read())!=-1){
        fileOut.write(i);
      }
    }
    finally{
      fileIn.close();
      fileOut.close();
    }
  }
}
