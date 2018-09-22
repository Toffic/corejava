/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 *
 * @author Pro
 */
 public class serializationindepth  {

     public static void main(String[] args) throws Exception{
//        ObjectOutputStream dos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Pro\\Desktop\\jj.sr"));
//           bake bake1 = new bake(); 
//         bake1.name="potato";
//         bake1.price=3999;
//        dos.writeObject(bake1);
//                 System.out.println("baked");
//     


ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Users/Pro/Desktop/jj.sr"));
        bake b = (bake) ois.readObject();
         System.out.println(b.name+" "+b.price+ " "+ b.nice);
     }
   
}




class bake implements Serializable{
 private static final long serialVersionUID=2l;
    int price;
    String name ;
    int nice;
            
    
}
