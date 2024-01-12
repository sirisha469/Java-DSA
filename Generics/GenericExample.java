package Generics;

import java.util.Calendar;
import java.util.Date;

//Repository is generic type which will accept any type of data tyep
class Repository<T>{
  //T : Type parameter or Type variable

  public T value;
}

public class GenericExample {
  public static void main(String[] args) {
    
    Repository<Integer> fifteen = new Repository<Integer>();
    fifteen.value = 15;
    System.out.println("Integer repository: "+fifteen.value);
    System.out.println("Class: "+fifteen.value.getClass());

    Repository<Double> tenPointOne = new Repository<Double>();
    tenPointOne.value = 10.1;
    System.out.println("Double repository: "+tenPointOne.value);
    System.out.println("Class: "+tenPointOne.value.getClass());

    Repository<Date> date = new Repository<Date>();
    date.value = (Date) Calendar.getInstance().getTime();
    System.out.println("Date repository: "+date.value);
    System.out.println("Class: "+date.value.getClass());
  }
}
