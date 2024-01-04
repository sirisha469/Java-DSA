package InputTaking;

import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleBasedIO {
  public static void main(String[] args) throws IOException {
    InputStreamReader ir = new InputStreamReader(System.in);

    char c=' ';
    StringBuffer sb = new StringBuffer();
    System.out.println("Enter a line: ");

    while((c=(char)ir.read())!='\n'){
      sb.append(c);
    }

    System.out.println(sb);
    ir.close();
  }
}
