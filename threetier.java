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
public class threetier
{
    public static void main(String[] args) {
        thirdtier thirdtier1 = new thirdtier();
        thirdtier1.show();
    }
         
}

class firsttier{
    int c= 48;
    void show () {
        int c = 23;
        System.out.println("the mother class value: "+ c);
}
    
}


class secondtier extends firsttier{
    int c = 39;
    
    void show (){
        System.out.println("the brother class vaalue "+ c);
    }

    @Override
    public String toString() {
    String cc = String.valueOf(c);
        return cc;
    }
    
}


class thirdtier extends secondtier{
    int c =40;
     void show (){
       //this.show();
       
  
       super.show();
         System.out.println("the  sister class value: "+ c);
        //   System.out.println( ((firsttier)(this)).c);
       //thirdtier sm =  (firsttier)(this);
     
     }
    
    
    
}