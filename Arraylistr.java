/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author Pro
 */
public class Arraylistr {
     ///inserting array into arraylist
    public void arraytoarraylist(String as[],ArrayList<String> f){
       for (String a : as) {
           f.add(a);
       }
        System.out.println("after insertion "+ f);
       
       }
    public static void main(String[] args) {
        ArrayList<String> f= new ArrayList();
        f.add("food");
        f.add("unstopable");
        f.add("moneygram");
        System.out.println("arraylist before: "+ f);
        String as[]=new String[f.size()];
        for (int i = 0; i < as.length; i++) {
            as[i]= f.get(i);
        }
     f.add("zip");
             
       Arraylistr arraylistr = new Arraylistr();
       arraylistr.arraytoarraylist(as, f);
       
    ////another simple example  for converting array into array list from an array
      int numbers[]= {4,5,5,6,6};
      ArrayList you = new ArrayList();
        for (int i = 0; i < numbers.length; i++) {
            you.add(numbers[i]);
        }
        System.out.println("the you list: " +you);
        
        
       //Arraylist to array
 String m[]= new String [f.size()];
        for (int i = 0; i < m.length; i++) {
            m[i]=f.get(i);
        }
           for(String a : m){
               System.out.println("the a value :"+ a);
           }
      String s[]= new String[f.size()];
    f.toArray(s);
    for(String mm:s){
        System.out.print("the s value :"+ mm);
    }
    int sss[]={3,5,6,7};
    
      ArrayList<String> fy= new ArrayList();
   
      ListIterator<String> fuo= fy.listIterator();
      while(fuo.hasNext()){
         String sy = fuo.next();
      }
    
    }
  
    
    
}
