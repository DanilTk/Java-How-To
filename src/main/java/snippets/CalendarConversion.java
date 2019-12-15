package snippets;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * Code snippet shows how to set time to Date class object
 */
public class CalendarConversion {
    public static void setTimeToDate() {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 24);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        Date date = calendar.getTime();
    }
}
