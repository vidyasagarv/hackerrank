import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.time.*;

public class DateAndTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        //parsing from String to Int
        int mm = Integer.parseInt(month);
        int dd = Integer.parseInt(day);
        int yyyy = Integer.parseInt(year);
        
        LocalDate dt = LocalDate.of(yyyy, mm, dd);
        System.out.println(dt.getDayOfWeek());
    }
}