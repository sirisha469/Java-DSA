package FileHandlingJava;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamRead{
  public static void main(String[] args) throws IOException {
    FileInputStream fileIn = null;

    try{
      fileIn = new FileInputStream("C:/Users/chsir/Desktop/desktop/Important/exam.txt");

      byte b1 = (byte)fileIn.read();
      System.out.println("Byte 1: "+b1);

      byte b2 = (byte)fileIn.read();
      System.out.println("Byte 2: "+b2);

      System.out.println("Bytes available: "+fileIn.available());

      int i=fileIn.read();
      System.out.println("Byte 3: "+i);

      System.out.println("Bytes Available: "+fileIn.available());

      fileIn.skip(11);
      System.out.println("Bytes Available: "+fileIn.available());
      
    }
    finally{
      fileIn.close();
      // System.out.println("Byte Stream Reader");
    }
  }
}