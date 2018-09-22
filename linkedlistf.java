/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Pro
 */
public class linkedlistf {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList();
        li.add("mavis");
        li.add("beacon");
        li.add("angela");
        li.add("joesph");
        li.add("botswana");
        li.push("willow");
        li.addFirst("smith");
       
      for (Object kk: li){
          System.out.println("using for each: "+ kk.toString());
      }
        
        System.out.println(li);
        ListIterator<String> ls = li.listIterator();
        while(ls.hasNext())
        {
            String l =ls.next();
            if (l == "beacon") {
                ls.remove();
            }
            
          
        }
        System.out.println(li);
        
        
        
        
        
    }
}
