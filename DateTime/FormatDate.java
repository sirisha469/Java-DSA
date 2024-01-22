package DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatDate {
  public static void main(String[] args) {
    LocalDateTime myDate = LocalDateTime.now();

    System.out.println("The date right now (no formatting) is: "+myDate);

    String myDate_isoString = myDate.format(DateTimeFormatter.ISO_DATE_TIME);

    System.out.println("The date right now (iso format) is: "+myDate_isoString);

    String myDate_mediumString = myDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));

    System.out.println("The date right now (medium format) is: "+myDate_mediumString);

  }
}
