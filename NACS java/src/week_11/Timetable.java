package week_11;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Timetable {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.parse("2003-03-13");
        LocalTime localTime = LocalTime.parse("10:00:00");
        System.out.println("Time: "+localTime +" ,Date: "+localDate);


       LocalTime timeAfter37min = localTime.plusMinutes(37).plusSeconds(21);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(timeAfter37min.format(formatter));


    }


}
