/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Pro
 */
public class Serialization {
    public static void main(String[] args) throws Exception {
        
    Sita s = new Sita();
    ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("c:\\Users\\Pro\\Desktop\\g.sr"));
    s.name="Toffic Nketia";
    s.rollno=35;
      
    ous.writeObject(s);
        System.out.println(s.d); 
        System.out.println("done writing");
            ous.close();
    try{
        Thread.sleep(2000);
    }catch (InterruptedException eo){
        
    }
ObjectInputStream ois = new ObjectInputStream (new FileInputStream("c:\\\\Users\\\\Pro\\\\Desktop\\\\g.sr"));
Sita ss = (Sita)ois.readObject();
        System.out.println("Name: "+ ss.name + " rollno: "+ ss.rollno + " Date: " + ss.d);
        ss.d=new Date();
        System.out.println(ss.d);
 


    }
}


class Sita implements Serializable {
    int rollno ;
    String name;
 transient    Date d = new Date();
}