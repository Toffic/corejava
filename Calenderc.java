/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Pro
 */
public class Calenderc {
    
    public static void main(String[] args) {
         Calendar calender = new GregorianCalendar(2018,05,16);
        System.out.println(calender.get(calender.DAY_OF_MONTH));
        System.out.println(calender.get(calender.DAY_OF_WEEK));
        System.out.println(calender.get(calender.MONTH));
        System.out.println(calender.get(calender.DAY_OF_YEAR));
     Date d = calender.getTime();
        SimpleDateFormat sf = new SimpleDateFormat("EEEE MMMM");
       String nameofday= sf.format(d);
        System.out.println("name of day: "+ nameofday);
    }
    
}
