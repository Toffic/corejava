/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author Pro
 */
public class zipfile {
    
    public static void main(String[] args) throws Exception {

    ZipOutputStream zp = new ZipOutputStream(new FileOutputStream("c:/Users/Pro/Desktop/Joromi.zip"));
    ZipEntry ze = new ZipEntry("BobMarley.mp3");
    zp.putNextEntry(ze);
    FileInputStream fis = new FileInputStream("c:/Users/Pro/Desktop/BobMarley.mp3");
   int count = 0;
    while (true){
        count = fis.read()  ;
        if (count == -1) {
           zp.closeEntry();
            zp.close();
            break;
        }
      zp.write(count);
    }
    
        System.out.println("done");
    }
    
}
