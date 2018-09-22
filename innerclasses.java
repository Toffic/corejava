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
public class innerclasses {
    public static void main(String[] args) {
        innerclasses.buttons buttons1 = new innerclasses.buttons();
     buttons1.show();
        
    }
         
    
    static int why = 38;
    int m= 87;
    static class buttons {
    void show (){
        
        System.out.println("buttons show inner: "+ why);
    }     
    }
    
}

 class testtry {
    innerclasses.buttons n= new innerclasses.buttons();
   
            
}