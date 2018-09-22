/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Pro
 */
public class newdateapi {

    public static void main(String[] args) {
       
        Instant current = Instant.now();
        System.out.println(current);
       Instant up = current.plus(3000,ChronoUnit.MILLIS);
    Instant here = current.plus(6000,ChronoUnit.MILLIS);
        System.out.println(here);
        Date d=  new GregorianCalendar().getTime();
        System.out.println("the date: " + d);
        System.out.println("the chrono");
        System.out.println(current.plus(3,ChronoUnit.DAYS));
        
        
        Duration du= Duration.between(up, here);
        System.out.println("the time different using the durationx");
        System.out.println(du.toMillis());
    }
}
