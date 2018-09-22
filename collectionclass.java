/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

/**
 *
 * @author Pro
 */
public class collectionclass {
    
    public static void main(String[] args) {
    
  
   
  String b[]= {"blue","sleep","run","high"};
 //List<String> ff = Arrays.asList(b);
  
  
 
      List<String> i =  new ArrayList();
      for(int c =0 ; c < b.length;c++){
          i.add(b[c]);
      }
       Collections.sort(i);
        System.out.println(i);
        Collections.sort(i,Collections.reverseOrder());
        System.out.println(i);
    }
}
