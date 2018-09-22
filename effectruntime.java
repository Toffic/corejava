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
public class effectruntime {
   static  void show (shape s){
        s.calarea();
//       if (s instanceof square ) {
//           System.out.println("square object passed");
//       }
//       if (s instanceof rectangle) {
//           System.out.println("rectangle object passed");
//       }

//          Class c = s.getClass();
//          System.out.println(c.getName());
if (s.getClass() == square.class) {
           System.out.println("the square class");
       }
else if (s.getClass() == rectangle.class) {
           System.out.println("the rectangle class");
       }
    
   }
    public static void main(String[] args) {
     
     
      //  rectangle  rectangle1 = new rectangle ();
        //square square1 = new square();
 
        
     show (new square());
    show (new rectangle());
    
        
    }
    
    
} 
 

abstract class shape{
  abstract  void calarea ();
    
    
    
}


class rectangle extends shape{
 int l =4;
 int w = 8;
    void calarea (){
         System.out.println("rectangle: "+ (l* w));
    
    }
    
    
  
}

class square extends shape {
    int l = 4;
    void calarea (){
        System.out.println("square: "+ (l*l));
    }
}
