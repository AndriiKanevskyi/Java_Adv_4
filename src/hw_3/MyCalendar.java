package hw_3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyCalendar {
    public static void main(String[] args) {
        Calendar dateOfBird = new GregorianCalendar(1994,Calendar.JUNE,17,14,32,53);
        Calendar now = Calendar.getInstance();
        //тут был индус
        Calendar roz = new GregorianCalendar(now.getTime().getYear()-dateOfBird.getTime().getYear(),now.getTime().getMonth()-dateOfBird.getTime().getMonth(),now.getTime().getDay()-dateOfBird.getTime().getDay(),now.getTime().getHours()-dateOfBird.getTime().getHours(),now.getTime().getMinutes()-dateOfBird.getTime().getMinutes(),now.getTime().getSeconds()-dateOfBird.getTime().getSeconds());

        DateFormat df = new SimpleDateFormat("dd.MM.YYYY kk:mm:ss");
        System.out.println("День рождения: "+df.format(dateOfBird.getTime()));
        System.out.println("Актуальное время: "+ df.format(now.getTime()));
        System.out.println("Прожито: "+df.format(roz.getTime()));





    }
}
