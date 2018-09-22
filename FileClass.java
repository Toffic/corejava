/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.io.File;
import java.io.IOException;
import java.io.FilenameFilter;

/**
 *
 * @author Pro
 */
public class FileClass {

    public static void main(String[] args) {
      File f= new File ("c:\\Users\\Pro\\Desktop\\javaplace\\");
         //File f= new File ("here\\");
        if (f.exists()) {
            System.out.println("directory exist");
            if (f.isAbsolute()) {
                System.out.println("path absolute");
            }else {
                System.out.println("path is relative");
 
            }
            ////getting file list 
    String filelist [] = f.list();
         for(String filenames: filelist){
          
                  System.out.println(filenames);
             
 
            
         }
         
         
         
         
        }else{
            System.out.println("file not found");
            try {
                f.createNewFile();
            } catch (IOException ex) {
                System.out.println("encountered problem when creating the file");
            }
        }
    }

    
}


class fnf implements FilenameFilter{

    @Override
    public boolean accept(File dir, String name) {
        if (name.endsWith(".txt")) 
            return true;
        else 
            return false;
        
       
    }
    
}
