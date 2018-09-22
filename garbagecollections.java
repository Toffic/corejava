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
public class garbagecollections {
 static   int created =0;
 static   int destroyed=0;
  static   void show  (){
        for(int x=0; x<30000; x++){
 new garbagecollections();
 }
 }
  
  
 public garbagecollections(){
     System.out.println("created: "+ created++);
}

    @Override
    protected void finalize() throws Throwable {
        System.out.println("destroyed: "+ destroyed++);
 //To change body of generated methods, choose Tools | Templates.
    }
 
 
 
    public static void main(String[] args) {
        show();
    }
}
