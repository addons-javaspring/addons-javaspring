package date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    // Instance object LocalDateTime
    LocalDateTime dateTimeNow = LocalDateTime.now();

    System.out.println(dateTimeNow);
    System.out.println(dateTimeNow.getDayOfMonth());
    System.out.println(dateTimeNow.plusDays(10));

    // formating
    // Thursday, 1 December 2022 HH:mm:ss
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, d MMMM y HH:mm:ss");
    String textDate = dateTimeNow.format(formatter);
    System.out.println(textDate);

    // mengembalikan dari yg aad formatnya menjadi date
    LocalDateTime dateConvert = LocalDateTime.parse(textDate, formatter);
    System.out.println(dateConvert);
  }
}
