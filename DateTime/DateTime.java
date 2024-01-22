package DateTime;

import java.time.LocalDateTime;

public class DateTime {
  public static void main(String[] args) {
    LocalDateTime myDate = LocalDateTime.now();

    System.err.println("The date right now is: "+myDate);

    System.out.println("The day of the month is: "+myDate.getDayOfMonth());

    System.out.println("The hour is: "+myDate.getHour());

    System.out.println("Two days ago was: "+myDate.minusDays(2));
  }
}
