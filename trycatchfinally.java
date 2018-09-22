package core;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pro
 */
public class trycatchfinally {
    public static void main(String[] args) {
       int c = 10;
       
        for (int i = 5; i > -3; --i) {
           try{ 
            System.out.println(c/i);
       
        
          }catch(ArithmeticException ae){
            System.out.println("oops "+ ae +":"+c);
            
        }finally{System.out.println("files saved");
        
        }
      
}
        
        
    }
    
}
