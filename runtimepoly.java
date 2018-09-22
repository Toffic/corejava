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
public class runtimepoly {
    
       
    public static void main(String[] args) {
  
        here here1 = new here();
        runtimepoly r = new runtimepoly();
        r.show();
         r= here1.show();
        r.show();
        mun m = new mun ();
       m.show();
    
        
    }
    int x ;
 runtimepoly show (){
    System.out.println("in show of poly");
    return new runtimepoly();
}    
}

 class here extends runtimepoly{
 there show (){
     System.out.println("in show of here");
     return new there();
 }   
}

class there extends runtimepoly{
 int x = 78;
    
    mun show (){
     System.out.println("in show of there");
     return new mun();
 }   
}

class mun extends runtimepoly{
    
}