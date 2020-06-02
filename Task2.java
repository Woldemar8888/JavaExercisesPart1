package theme_4;


import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Task2 {

     void getDate( int dayNumber){

         if(dayNumber >365 || dayNumber <1){
             System.out.println("Incorrect day of year");
             return;
         }

         Calendar calendar = Calendar.getInstance();
         calendar.set(2019, 0, 01);  // set any not a leap year (2019)
         calendar.add(Calendar.DAY_OF_YEAR, dayNumber - 1);

         SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM");
         System.out.println(simpleDateFormat.format(calendar.getTime()));

    }
}
