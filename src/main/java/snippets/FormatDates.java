package snippets;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Code snippet shows how to set date format (Java 8 API)
 */

public class FormatDates {

    public static void dateFormatting() {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String myDate = "01/01/2000";
        LocalDate date = LocalDate.parse(myDate, dateTimeFormatter);
        System.out.println(date);
    }
}
