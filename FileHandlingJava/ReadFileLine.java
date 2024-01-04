package FileHandlingJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLine {
  public static void main(String[] args) throws IOException{
    FileReader fileRead = new FileReader("C:/Users/chsir/Desktop/desktop/Important/out_characterstream.txt");

    try(BufferedReader br = new BufferedReader(fileRead)){
      
      String read="";
      while((read=br.readLine())!=null){
        System.out.println(read);
      }
    }
    finally{
      fileRead.close();
    }
  }
}
