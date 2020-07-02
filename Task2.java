package by.epamtc.aladzyin.theme_4;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Task2 {
    private String date = "";

    public String getDate( int dayNumber){

        if ( dayNumber < 1 || dayNumber > 365){
            date = "Incorrect day of year";
        }

/*
    variant 1

 */

        int month = 0;
        int monthDay = 1;
        int restOfDays = dayNumber;

        int [] countOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String [] months = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
                };

        while ( restOfDays > 0){

            if(restOfDays <= countOfDays[month]){
                monthDay = restOfDays;
            }

            restOfDays -= countOfDays[month];

            if(restOfDays > 0){
                month++;
            }
        }

        date = months[month] + " " + monthDay;

/*
    variant 2
 */

//        Calendar calendar = Calendar.getInstance();
//        calendar.set(2019, 0, 01);  // set any not a leap year (2019)
//        calendar.add(Calendar.DAY_OF_YEAR, dayNumber - 1);
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM");
//
//        date = simpleDateFormat.format(calendar.getTime());
//
        return date;
    }
}
