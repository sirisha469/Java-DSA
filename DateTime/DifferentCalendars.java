package DateTime;

import java.time.LocalDateTime;
import java.time.chrono.JapaneseDate;
import java.time.chrono.ThaiBuddhistDate;

public class DifferentCalendars {
  public static void main(String[] args) {
    LocalDateTime myDate = LocalDateTime.now();

    System.out.println("The Gregorian date right now is: "+myDate);

    JapaneseDate jDate = JapaneseDate.now();

    System.out.println("The Japanese date right now is: "+jDate);

    ThaiBuddhistDate tDate = ThaiBuddhistDate.now();

    System.out.println("The ThaiBuddhistDate right now is: "+tDate);

    
  }
}
