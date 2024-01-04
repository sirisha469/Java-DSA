package FileHandlingJava;

import java.io.Console;

public class ConsoleTest {
  public static void main(String[] args) {
    Console cn = System.console();

    String name = cn.readLine("Enter name: ");
    char c[] = cn.readPassword("Enter password: ");
    String pass = new String(c);

    System.out.println("Name:"+name);
    System.out.println("Password:"+pass);

  }
}
