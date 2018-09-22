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


//anonymous class with finalize to monitor the object created and deleted
public class anonymousclass2 {
     static   int created =0;
 static   int destroyed=0;
      @Override
    protected void finalize() throws Throwable {
     System.out.println("destroyed: "+ destroyed++);
    }
   static   void vibe  (){
        for(int x=0; x<30000; x++){
            
final int mine = 4;
 System.out.println("created: "+ created++);        
method(new worker (){
           public void show (){
               System.out.println("the value of the anonymous class:" + mine);
       
           } 
        });

   
 }
       
 }
 
 
 
static void method(driver d){
   d.show();
  
   
}

 

    public static void main(String[] args) {
   //   method (new worker());
        
 
    vibe();
    
    
    }

 
    
 public anonymousclass2(){
     System.out.println("created: "+ created++);
}
 


    
    
}






interface driver  {
    void show ();
}



class worker implements driver {

    @Override
    public void show() {
        System.out.println("the value within the worker :");
    }
  
} 