/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author Pro
 */
public class Enum {


   public enum Office_days {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY
};

    public static void main(String[] args) {
        for (Office_days mu: Office_days.values()){
            System.out.println("this day: "+ mu);
        }
        
       Office_days d = Office_days.WEDNESDAY;
    switch (d){  
        case MONDAY: System.out.println("it is monday"); break;
        case TUESDAY: System.out.println("it is tuesday");break;
        case WEDNESDAY: System.out.println("it is wednesday");break;
        case THURSDAY: System.out.println("it is thursday");break;
       case FRIDAY: System.out.println("it is friday");break;
        default : System.out.println("nothing found sorry");
            
        
    }
    
    String  datem = (d.equals(Office_days.MONDAY))? "found it on monday" : (d.equals(Office_days.FRIDAY))? "yes friday" : "ternary found nothing";
        System.out.println(datem);
    
    
    }
  
    


    
}
