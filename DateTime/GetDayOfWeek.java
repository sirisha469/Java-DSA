package DateTime;

import java.time.LocalDate;

public class GetDayOfWeek {
  public static void main(String[] args) {
    int month = 07;
    int day = 16;
    int year = 2002;

    LocalDate l = LocalDate.of(year,month,day);

    System.out.println(l.getDayOfWeek());
  }
}
