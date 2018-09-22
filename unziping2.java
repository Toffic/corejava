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
import java.util.zip.ZipInputStream;

/**
 *
 * @author Pro
 */
public class unziping2 {
    public static void main(String[] args) throws Exception{
      ZipInputStream zi = new ZipInputStream(new FileInputStream("C:/Users/Pro/Desktop/lover.zip")); 
      String path = "C:/Users/Pro/Desktop/lover.zip";
      String name = path.substring(path.lastIndexOf("/")+1, path.lastIndexOf("."));
        System.out.println(name);
      File f = new File("C:/Users/Pro/Desktop/"+name );
    int count =0;
      if(!f.exists())
          f.mkdir();
      while(true){
          ZipEntry ze = zi.getNextEntry();
          if(ze  == null)
              break;
              
          FileOutputStream fis = new FileOutputStream  (f.getAbsoluteFile()+"\\" + ze.getName());
          System.out.println(f.getAbsoluteFile()+"\\" + ze.getName());
          
          while((count = zi.read()) != -1)
            fis.write(count);
          fis.close();
              
          
              
           
          
      }
      zi.closeEntry();
      zi.close();
        System.out.println("done");
      
        
    }
}
