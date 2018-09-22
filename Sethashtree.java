/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author Pro
 */
public class Sethashtree {
   void removeduplicate(String word){
        HashSet<String> hs = new HashSet();
            StringTokenizer st= new StringTokenizer (word," ");
        while(st.hasMoreTokens()){
           String a =st.nextToken();
            hs.add(a);
          
         
        }
        System.out.println("size:"+ hs.size());
        System.out.println(hs);
        
   }
   
   void treesortset (String word){
       TreeSet<String> ts = new TreeSet<>(new comp());
       StringTokenizer st= new StringTokenizer (word," ");
       while (st.hasMoreTokens()){
          String s= st.nextToken();
           ts.add(s);
       }
       System.out.println(ts);
   }
   
    public static void main(String[] args) {
       
        String word = "the the name name of of the the boy boy is is not not known known";
        Sethashtree sethashtree = new Sethashtree();
        sethashtree.removeduplicate(word);
        
        sethashtree.treesortset(word);
         
    }
    
}

class comp implements Comparator<String>{

 
    public int compare(String o1, String o2) {
return o2.compareTo(o1);
    }

  
    
}