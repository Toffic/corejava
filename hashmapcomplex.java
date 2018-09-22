/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Pro
 */
public class hashmapcomplex {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap();
        hm.put("1", "498989");
        hm.put("2", "224423");
        hm.put("3", "112223");
        System.out.println(hm);
        
        Set s = hm.entrySet();
        Iterator<Map.Entry<String,String>> i = s.iterator();
        while(i.hasNext()){
            Map.Entry<String,String> h = i.next();
            String key = h.getKey();
            String value = h.getValue();
            System.out.println("key: "+ key + " value: "+ value);
        }
        
        /////////////////////////now going a step forward /////////////////
        HashMap<String,HashMap<String,String>> hhm = new HashMap();
        HashMap<String,String> userone = new HashMap();
        userone.put("Office", "2948458");
        userone.put("home", "2948458");
        userone.put("vacation house", "2948458");
        
        HashMap<String,String>usertwo = new HashMap();
        usertwo.put("Office", "1111111");
        usertwo.put("home", "22222222");
        usertwo.put("vacation house", "44444444");
        
       hhm.put("Brandy", userone);
       hhm.put("George",usertwo);
       
       
       Set ss =  hhm.entrySet();
       Iterator<Map.Entry<String,String>> ii = ss.iterator();
       while(ii.hasNext()){
           Map.Entry<String,String> me = ii.next();
           String k=me.getKey();
    //  String v= me.getValue();
        HashMap<String,String> inside = hhm.get(k);
        Set sss = inside.entrySet();
        Iterator<Map.Entry<String,String>> iii= sss.iterator();
        while (iii.hasNext()){
            Map.Entry<String,String> mee = iii.next();
            String keyinside = mee.getKey();
            String valueinside = mee.getValue();
           
            
            
            System.out.println("Name: "+ k + " Number Type: " +  keyinside + ":"+ mee.getValue());
            
            
            
            
       
        
        
        }
        
        /////finding specific numbers within a hashmap inside a hashmap/////
           if (hhm.containsKey("George")) {
               HashMap<String,String> search = hhm.get("George");
              String found =search.get("home");
               System.out.println("home number: "+ found);
              
           }
          
                   
       }
    
       
       
        
        
    }
    
    
    
    
}
