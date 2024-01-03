package FileHandlingJava;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWrite {
  public static void main(String[] args) throws IOException{
    FileOutputStream fileOut = null;

    try{
      fileOut = new FileOutputStream("C:/Users/chsir/Desktop/desktop/Important/out_stream_file");

      byte b = 65;
      fileOut.write(b);

      b=66;
      fileOut.write(b);

      byte[] b1 = {97,98,99,100};
      fileOut.write(b1);

      String data = "\nsome test content file in the byte stream file\n";
      fileOut.write(data.getBytes());

    }
    finally{
      fileOut.close();
    }
  }
}
