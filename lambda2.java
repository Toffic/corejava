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
public class lambda2 {
 static void frmmasters (masters mm){
     mm.show(4);
     
 }
    public static void main(String[] args) {
      int x = 99;
        
      masters mu = (n)-> {
          System.out.println("world");
            System.out.println(x);
            
          System.out.println("hello "+ n);};
      
      
        frmmasters( mu);
    }
    
}


@FunctionalInterface
interface masters {
  
    void show (int n);
    default void show3 (){
        System.out.println("the show 3");
    }
    
    
}