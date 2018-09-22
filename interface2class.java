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
public class interface2class  implements methodsdisplay,olivertwist{
    public static void main(String[] args) {
        interface2class interface2class1 = new interface2class();
      interface2class1.show();
       
    }
    @Override
  
  
    public void show() {
       olivertwist.super.show1();
    }
}


interface methodsdisplay {
    void show ();
//    default void show1 (){
//        System.out.println("this is from the interface");
//    }
//    
}

interface olivertwist {
    
    default void show1 (){
        System.out.println("all ma niggas");
        
    }
}