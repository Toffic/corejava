/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 *
 * @author Pro
 */
public class unziping {

    public static void main(String[] args) throws Exception {

        ZipInputStream zi = new ZipInputStream(new FileInputStream("c:/Users/Pro/Desktop/lover.zip"));

          int count = 0;
        while (true) {
            ZipEntry ze = zi.getNextEntry();
            if (ze == null) {
                break;
            }
            
            FileOutputStream fos = new FileOutputStream("c:/Users/Pro/Desktop/real backup/"+ ze.getName());
         
            
         
            while ((count =zi.read())  != -1)
            fos.write(count);
            
           fos.close();

        }
        
        zi.close();
        System.out.println("done");

    }
}
