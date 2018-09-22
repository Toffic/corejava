/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Pro
 */
public class DataOutput1 {
    public static void main(String[] args) throws Exception {
        // working with datastream
        
        DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\Pro\\Desktop\\BobMarley.mp3"));
    DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\Pro\\Desktop\\test\\Dontworry.mp3"));
    try{
        int count =0;
     
        while((count=dis.read()) != -1){
          
            dos.write(count);
           
        }
    }   catch (Exception re){
        System.out.println("done transferring of files ");
    }
    
        
    }
    
}
