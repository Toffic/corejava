/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Pro
 */
public class FileClass2 {
    public static void main(String[] args) throws IOException {
 String path ="c:\\Users\\Pro\\Desktop\\likeme\\messup\\";
 File filepath = new File(path);   
 if (filepath.exists()) {
     ///search directory
     String filelist[]= filepath.list();
     for(String listfile: filelist)
         System.out.println(listfile);



///create a file
     
     File file = new File(path,"newfile.txt");
     
     if (file.exists()) {
         
     }else{
         file.createNewFile();
         System.out.println("file created");
     }
     ///deleting the files
            //  boolean delte= file.delete();
            //System.out.println("file deleted: "+  delte);
     
    //renaming and moving the file
    String pathtwo ="c:\\Users\\Pro\\Desktop\\likeme\\";
   boolean newtype = file.renameTo(new File(pathtwo+"\\newfile3.txt"));
        System.out.println("the new rename: "+ newtype);
        File fe = new File(pathtwo+"\\newfile3.txt");
     if (fe.exists()) {
         System.out.println("the new file exist");
         ////makingfile readonly
                // boolean readfile =  fe.setReadOnly();
                //System.out.println("made read only: "+ readfile);
         //removing readonly file 
         boolean removery = fe.setWritable(true);
         System.out.println("is writeable: "+ removery);
         
     }else {
         System.out.println("the new rename do not exist");
     }
            
     
     
        }else{
     filepath.mkdirs();
     System.out.println("directory created");
     
 }
       
        
    }
}
