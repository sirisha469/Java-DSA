package FileHandlingJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageInputOutputStream{
  public static void main(String[] args) throws IOException{
    FileInputStream imgFileIn = null;
    FileOutputStream imgFileOut = null;

    try{
      imgFileIn = new FileInputStream("C:/Users/chsir/Desktop/desktop/Signature.jpeg");

      imgFileOut = new FileOutputStream("C:/Users/chsir/Desktop/desktop/copy_Signature.jpeg");

      int i;
      while((i=imgFileIn.read())!=-1){
        System.out.print(i);
        imgFileOut.write(i);
      }
    }
    finally{
      imgFileIn.close();
      imgFileOut.close();
    }
  }
}
