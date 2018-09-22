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
public class constructorsw {
   int l,h,w;
     public constructorsw(int l, int h , int w) {
   this(l,h);
   this.w=w;
    }

    public constructorsw(int l, int h) {
     this.l=l;
     this.h= h;
        
//  this.w = w;
    }
    
    void print (){
        System.out.println("value for it "+ (l+w+h));
    }
    public static void main(String[] args) {
        constructorsw constructorsw1 = new constructorsw(4,4,3);
       constructorsw1.print();
    }

  
    
    
}
