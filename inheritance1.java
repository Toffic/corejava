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
/// to not waste memory we be creating two classes in this class and be extending one on one;
public class inheritance1 {
    public static void main(String[] args) {
        home home1 = new home();
        home1.show();
        
    }
}
 

class city {
    public city(String name){
        
    }
    int c = 50;
    
    String cities= "Accra";
  void show (){
       System.out.println("the city class invoke: "+ cities);
       
   }
    
 }



 class home extends city{
  public home (){
      super("hello");
  }
  int c = 10;
  void show (){
      super.show();
      System.out.println("from home " );
      System.out.println("the value in home is "+ c+ "the value at super is "+ super.c);
  }
     
   
}

