package FileHandlingJava;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamFileRead {
  public static void main(String[] args) throws IOException {
    FileInputStream fileIn = null;

    try{
      fileIn = new FileInputStream("C:/Users/chsir/Desktop/desktop/Important/1. What is JIT Compiler.txt");

      int j;
      while((j=fileIn.read())!=-1){
        System.out.print((char)j);
      }

    }
    finally{
      fileIn.close();
    }
  }
}
