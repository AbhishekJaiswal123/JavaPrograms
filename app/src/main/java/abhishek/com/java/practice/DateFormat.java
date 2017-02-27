package abhishek.com.java.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by abhishek on 31/10/16.
 */

public class DateFormat {

    public static void main(String[] args) {



        try {
            String oldstring = "2016-10-31";
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(oldstring);

            SimpleDateFormat simpDate = new SimpleDateFormat("E dd MMMMM yyyy");
            System.out.println(simpDate.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
