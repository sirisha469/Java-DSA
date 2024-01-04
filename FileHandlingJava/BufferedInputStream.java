package FileHandlingJava;

import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream {
  public static void main(String[] args) throws IOException{
    FileInputStream fi = new FileInputStream("C:/Users/chsir/Desktop/desktop/Important/1. What is JIT Compiler.txt");
    // BufferedInputStream bis = new BufferedInputStream();

    int value;
    while((value=fi.read())!=-1){
      System.out.print((char)value);
    }
    fi.close();
    // bis.clone();
  }
}
