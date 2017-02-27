package abhishek.com.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by abhishek on 31/10/16.
 */

public class TimeFormat {


    public static void main(String[] args) {
        final String time = "2009-09-22 12:47:08";

        try {
            final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            final Date dateObj = sdf.parse(time);
            System.out.println(dateObj);
            System.out.println(new SimpleDateFormat("hh:mm a E dd MMMM").format(dateObj));
        } catch (final ParseException e) {
            e.printStackTrace();
        }
    }
}
