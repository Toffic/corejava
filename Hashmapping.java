/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

/**
 *
 * @author Pro
 */
public class Hashmapping {
  
    public static void main(String[] args) {
  HashMap<String,String> hm = new HashMap();
        hm.put("1", "boy");
        hm.put("2","girl");
        hm.put("3","american");
        hm.put("4","African");
        
        System.out.println(hm);
        Set s = hm.keySet();
        Iterator<String> i= s.iterator();
        while(i.hasNext()){
            String key = i.next();
            System.out.println("key: "+ key+ " value: "+hm.get(key));
        }
        
        
        HashMap<String,Vector<String>> hmm = new HashMap();
        Vector<String> v1 =new Vector ();
        v1.add("6434543435");
        v1.add("6434543435");
        v1.add("6434543435");
        v1.add("6434543435");
        
       Vector<String> v2 =new Vector ();
        v2.add("6434543435");
        v2.add("6434543435");
        v2.add("6434543435");
        v2.add("6434543435");
        
        hmm.put("user one", v1);
        hmm.put("user two", v2);
        
        System.out.println("with vector: "+ hmm );
        
       ////getting the values from the multi-user mapset
              System.out.println("");
       Set ss = hmm.keySet();
       Iterator<String> ii = ss.iterator();
       while (ii.hasNext()){
           String key = ii.next();
           Vector<String> phone = hmm.get(key);
    
           //for(String g: phone)
         System.out.println("user: "+ key + " number: " + hmm.get(key));
           
      
       
          
       }
          
         ////searching using the key // single 
           if (hm.containsKey("46")) {
               System.out.println("it is there and the values is :" + hm.get("4"));
               
           }else{
               System.out.println("sorry entry not found ");
               
           }
           
           ////searching using values // single 
           if (hm.containsValue("girll")) {
               System.out.println("the values is there the key :");
               
               
           }else{
               System.out.println("key not found");
           }
       
       /////searching multi-value using single key 
       
        
    }
        
    
}
