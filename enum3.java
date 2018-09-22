/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.Scanner;

/**
 *
 * @author Pro
 */
public class enum3 {

public enum ageCategory{
    CHILD(1) {
        @Override
        public void message() {
            System.out.println("a child is not a slave");
        }
    },ADULT(2) {
        @Override
        public void message() {
            System.out.println("an adult can work too");
        }
    },SENIOR(3) {
        @Override
        public void message() {
            System.out.println("the respect is good");
        }
    },OTHER(4) {
        @Override
        public void message() {
            System.out.println("let not mistake");
        }
    };
    int value;
    ageCategory(int i){
        value=i;
    }
    public int getValue(){
        
        return value;
  }
    public abstract void message();
}


    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        System.out.println("What category are you? (child,adult,senior)");
        String userValue= sc.next();
      String check = (userValue.equalsIgnoreCase(ageCategory.CHILD.name()) )? ageCategory.CHILD.name() : (userValue.equalsIgnoreCase( ageCategory.ADULT.name()))?ageCategory.ADULT.name()  : (userValue.equalsIgnoreCase(ageCategory.SENIOR.name()))? ageCategory.SENIOR.name(): ageCategory.OTHER.name();
    int m= ageCategory.valueOf(check).value; 
   
         
      
      System.out.println(check.toLowerCase()+" value: "+ m  );
        System.out.println("");
       ageCategory.valueOf(check).message();
      
         
        System.out.println("All categories");
        for( ageCategory all: ageCategory.values()){
            
            System.out.println(all );
               all.message();
            System.out.println(all.value);
        }
        
    }
    



    
}



