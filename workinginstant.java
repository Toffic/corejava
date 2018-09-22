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
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author Pro
 */
public class workinginstant {


    public static void main(String[] args) {
      Instant first = Instant.now();
        Instant one = Instant.now().plus(Duration.ofDays(4).plusMinutes(30));
     Instant second=   first.plus(2,ChronoUnit.DAYS);
        if (one.isAfter(second)) {
            System.out.println("first is ahead with a difference of:");
            Duration d= Duration.between(one, second);
            System.out.println(d);
 
        }else if (second.isAfter(one))  {
            System.out.println("second is ahead with a difference of :");
            long k= ChronoUnit.DAYS.between(first, second);
            String pn= "Days";
            System.out.println(k + pn );
            }
 
    
    ///parsing in time to the instant class
 
       Instant monitoer= Instant.parse("2048-06-17T06:15:58.712Z");
       Date d= Date.from(monitoer);
       SimpleDateFormat sf = new SimpleDateFormat("yyyy-MMMM-dd");
       String friend = sf.format(d);
       System.out.println("parse time: " + friend);
    
       ///chipping this in to save space 
       LocalDate  ld= LocalDate.of(1996, 5, 24);
        System.out.println("time inserted by localdate: "+ ld);
    LocalDate nn = LocalDate.now();
   Period l = Period.between(nn, ld);
        System.out.println("the period diff: "+ l);
        Period u= ld.until(nn);
        System.out.println("until: "+ u);
        System.out.println("leap: "+ ld.isLeapYear());
    
        long chrono = ChronoUnit.YEARS.between(ld, nn);
        System.out.println("with chron: "+ chrono);
        
    }

    
    
    
    }
    

