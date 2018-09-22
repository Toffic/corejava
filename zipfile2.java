/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author Pro
 */
public class zipfile2 {
    public static void main(String[] args) throws Exception{
   
   ZipOutputStream zp = new ZipOutputStream(new FileOutputStream("c:/Users/Pro/Desktop/lover.zip"));  
   File f = new File ("c:/Users/Pro/Desktop/test/");
   String filelist [] = f.list();
        for (int i = 0; i < filelist.length; i++) {
          ZipEntry ze = new ZipEntry(filelist[i]);
          zp.putNextEntry(ze);
           
            FileInputStream fis = new FileInputStream("c:/Users/Pro/Desktop/test/"+filelist[i]);
          int count = 0;
            while (true){
                
               
                count = fis.read();
                if (count == -1) {
                    zp.closeEntry();
                    break;
                }
                
                zp.write(count);
                
                
                
            }
        
        
        }
        
        zp.close();
        System.out.println("done ");
    }
 
}
