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
public class interfaces implements shapes{
     int l = 4;
     int w = 8;
    public static void main(String[] args) {
        interfaces interfaces1 = new interfaces();
   interfaces1. calcarea();
        System.out.println(fi);
     
    }

    @Override
    public void calcarea() {
        System.out.println("the result:" + rectangle() );
    }

    
  
    public int rectangle() {
       return l*w;
    }
    
    
}




interface shapes extends methods {
    void calcarea (); 
    float fi= 4.54f;
}

interface methods {
    int  rectangle ();
}


