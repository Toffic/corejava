/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
/**
 *
 * @author Pro
 */
public class buffering {
 
    //working with buffers i/o
    //1. bufferedinput/output stream  for images , sound ,videos
    public static void main(String[] args)  throws Exception{
        String path = "C:\\Users\\Pro\\Desktop\\likeme";
        File f =  new File(path);
        if (f.exists()) {
         File content = new File (f.getAbsolutePath()+"\\newpic.jpg");
     
         BufferedInputStream bis = new BufferedInputStream(new FileInputStream(content));
         BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f.getAbsoluteFile()+"\\form.jpg"));
         int count= 0;  
         while(true){
               count = bis.read();
             if (count == -1) 
                 break;
             
               bos.write(count);
            }
         bis.close();
         bos.close();
            
        }
        
        ///working with bufferedreader/writer for characters 
        String path2 = "C:\\Users\\Pro\\Desktop\\likeme";
        if (new File(path2).exists()) {
            BufferedReader biis = new BufferedReader(new FileReader(path2+"\\wot.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter(path2+"\\wot2.txt"));
          String data = "";
           while (biis.readLine() != null){
             
                 data =biis.readLine() ;
             
               
                   bw.write(data);
                   bw.newLine();
     
            }
            
            bw.close();
            biis.close();
            
            
            
        }
        
    }
    
}
