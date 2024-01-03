package FileHandlingJava;

import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamOut {
  public static void main(String[] args) throws IOException{
    FileWriter fileWriteOut = null;

    try{
      fileWriteOut = new FileWriter("C:/Users/chsir/Desktop/desktop/Important/out_characterstream.txt");

      char ch = 'a';
      fileWriteOut.write(ch);

      int b = 65;
      fileWriteOut.write(b);

      b=66;
      fileWriteOut.write(b);

      char[] b1 = {97,98,99,100};
      fileWriteOut.write(b1);

      String data = "\nsome test content file in the byte stream file\n";
      fileWriteOut.write(data);

      String more = "\nAlice Bob\n";
      fileWriteOut.write(more,7,4); //from 7th index +4 characetrs are added

      String s = "\n My name is siri\n";
      fileWriteOut.append(s);
    }
    finally{
      fileWriteOut.close();
    }
  }
}
