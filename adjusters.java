/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author Pro
 */
public class adjusters {
    public static void main(String[] args) {
        LocalDate t = LocalDate.of(2018,06,1);
        System.out.println("Now: "+ t);
     LocalDate et =t.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
       int count = 1;
       int no = (t.getMonth().maxLength())/7;
       
        for (int i = 0; i <= no; i++) {
              System.out.println("number of fridays: "+ et );
        et = et.plus(1,ChronoUnit.WEEKS);
        
        }
      
        
        
///FORMATTING WITH THE NEW API
DateTimeFormatter df= DateTimeFormatter.ofPattern("MMMM dd yyyy hh:mm:ss");
LocalDateTime ld= LocalDateTime.now();
String name = df.format(ld);
        System.out.println(name );
        
    
   
    
    
    }
    
}
