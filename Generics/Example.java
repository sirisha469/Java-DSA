package Generics;

import java.util.Calendar;
import java.util.Date;

public class Example<T> {

  private T var;

  Example(T var){
    this.var = var;
  }


  public static void main(String[] args) {
    
    Example<Integer> e1 = new Example<>(12);
    System.out.println(e1.var);

    Example<String> e2 = new Example<>("Siri");
    System.out.println(e2.var);

    Example<Date> date = new Example<>(Calendar.getInstance().getTime());
    System.out.println(date.var);
  }
}
