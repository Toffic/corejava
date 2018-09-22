/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.Objects;

/**
 *
 * @author Pro
 */
public class grandclass {

  
   
    int x=  59;
    String name = "bright";
    static final a a1 = new a();
   static final  b b1 = new b();
    public static void main(String[] args) {
       
       
     
        
        
        String pointer = (a1.equals(b1))? "they are equal" : "not equal";
        System.out.println(pointer);
        System.out.println(a1);
        System.out.println("");
        System.out.println("getting the hash code values");
    //    System.out.println(a1.hashCode() + " :"+ b1.hashCode());
    
   
    
    }

   
    @Override
    public int hashCode() {
//        int hash = 8;
//        hash = 97 * hash + this.x;
//        hash = 97 * hash + Objects.hashCode(this.name);
//        return hash;

return  Integer.toString(x).hashCode()+ name.hashCode() ;
    }



    @Override
    public boolean equals(Object obj) {
     //   grandclass grandclass1 = (grandclass) obj;
        
        boolean m = (a1.name==b1.name && a1.x==b1.x)? true : false;
        return m;
        
    }
      @Override
        public String toString() {
        return name + " "+ x;
        }

}


class a extends grandclass  {
    
      
    
}


class b extends grandclass {
    
    
}