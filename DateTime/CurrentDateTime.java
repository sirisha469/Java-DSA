package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {
  public static void main(String[] args) {
    //Date
    LocalDate myDate = LocalDate.now();
    System.out.println(myDate);

    //Time
    LocalTime myTime = LocalTime.now();
    System.out.println(myTime);

    //DateTime
    LocalDateTime myDateTime = LocalDateTime.now();
    System.out.println(myDateTime);


    //Formatted DateTime
    DateTimeFormatter myDateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
    String formattedDateTime = myDateTime.format(myDateTimeFormatter);
    System.out.println(formattedDateTime);
  }
}
