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
public class passbyvalueandobject {
     int count = 0;
   private static void obj(passbyvalueandobject s){
        
       
       
        s.count= 4;
       System.out.println(s.count);
      s =  new passbyvalueandobject();
        System.out.println("new  "+ s.count );
    }



    public static void main(String[] args) {
        passbyvalueandobject objwork = new passbyvalueandobject();
        objwork.count=69;
       
        
        obj(objwork);
        
        
        
    }


}
