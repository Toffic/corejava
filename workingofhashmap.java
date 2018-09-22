/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.HashMap;

/**
 *
 * @author Pro
 */
public class workingofhashmap {
   
    public static void main(String[] args) {
     StudentClass a = new StudentClass();
    StudentClass b = new StudentClass();
    a.name="h";
    b.name="h";
    
    
    HashMap<StudentClass,String> f= new HashMap();
     f.put(b, "bum");
    f.put(a,"first");
   
    
        System.out.println(f);
    
    
    
    }
}


class StudentClass {
    String name ;
    int roll;

    @Override
    public int hashCode() {
       
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
     StudentClass s = (StudentClass)obj;
        if (s.name.equals(this.name)) 
            return true;
        else
            return false;
      
    }
    
    
}