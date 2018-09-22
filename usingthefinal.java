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
public class usingthefinal {
   int x = 0;
   static  void show (final usingthefinal u){
             u.x= 7;
       System.out.println("here" + u.x);
      
    }

    public static void main(String[] args) {
        usingthefinal usingthefinal1 = new usingthefinal();
        show(usingthefinal1);
       
        
    }
    
}
