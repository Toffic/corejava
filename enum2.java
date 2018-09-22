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
public class enum2 {
    
public enum Office_days {
  //with abstract and field
    MONDAY(1) {
        @Override
        public void givemessage() {
            System.out.println("the value of monday");
        }
    }, TUESDAY(2) {
        @Override
        public void givemessage() {
            System.out.println("the value of tuesday");
        }
    }, WEDNESDAY(3) {
        @Override
        public void givemessage() {
            System.out.println("the value of wednesday");
        }
    }, THURSDAY(4) {
        @Override
        public void givemessage() {
            System.out.println("the value of thursday");
                 
        }
    }, FRIDAY(5) {
        @Override
        public void givemessage() {
            System.out.println("the value of friday");
        }
    };
 
   private  int count =0;
    Office_days (int k){
       count=k;
        }
        public int getCount (){
       
            return count;
    
            
        }
   public abstract void givemessage();
     
};

    public static void main(String[] args) {
        Office_days d= Office_days.THURSDAY;
     d.givemessage();
        System.out.println(d.count );
        
    }

}



