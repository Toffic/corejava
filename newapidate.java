/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author Pro
 */
public class newapidate {
    public static void main(String[] args) {
        /// the new api for  date
        LocalDate ld= LocalDate.now();
        System.out.println(ld);
     
        LocalDate d = ld.plus(Period.ofDays(2));
        System.out.println("Period update: "+ d);
        
        LocalDate dd = ld.plus(4, ChronoUnit.DAYS);
        System.out.println("ChronoUnit: "+ dd);
        
        System.out.println( "After 4 days: "+dd.getDayOfWeek());
        System.out.println("added some days and finding the day of week: " + dd.plus(Period.ofDays(1)).getDayOfWeek());
        
        ////time api
   LocalTime lt =LocalTime.now();
        
        System.out.println("TIME");
   System.out.println(lt);
        LocalTime tt= lt.plus(Duration.ofHours(2));
        System.out.println("will it :"+ tt);
        System.out.println(tt.plus(2, ChronoUnit.HOURS));
        
        
        
        
        ///LocalDateTime api
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("COMBINATION OF COURSE:");
        System.out.println(ldt.getDayOfWeek());
  
        
        
    }
    
}
