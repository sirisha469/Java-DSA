package DateTime;

import java.time.LocalDate;

public class ConvertingDate {
  public static void main(String[] args) {
    LocalDate myDate = LocalDate.now();

    System.out.println("The date right now is: "+myDate);

    LocalDate somDate = LocalDate.of(2023,06,07);

    System.out.println("The first day of the year is: "+somDate);

    String s = "2023-12-19";

    LocalDate date = LocalDate.parse(s);

    System.out.println("The string of the date is: "+date);
  }
}
