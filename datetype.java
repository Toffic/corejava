/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Pro
 */
public class datetype {
    ///genesis
    
    public static void main(String[] args) {
        long l  = System.currentTimeMillis();
        System.out.println(l/(1000*60*60*24));
        System.out.println((l/(1000*60*60*24))/12);
        
        Date d=new Date();
        System.out.println(d);
        SimpleDateFormat sd=new SimpleDateFormat("EEEE MMMM/dd/YYYY ; hh:mm:ss");
     
        String simple = sd.format(d);
        System.out.println(simple);
    }
}
