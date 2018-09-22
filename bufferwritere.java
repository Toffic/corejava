/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Pro
 */
public class bufferwritere {

    public static void main(String[] args) throws Exception {
         String path2 = "C:\\Users\\Pro\\Desktop\\likeme";
       File f = new File (path2);
         if (new File(path2).exists()) {
         BufferedReader br= new BufferedReader(new FileReader (f.getAbsoluteFile()+"\\wot.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter(path2+"\\wot22.txt"));
          String data = "";
           while ((data=br.readLine()) != null){
                bw.write(data);
                  bw.newLine();
     
            }
            
            bw.close();
            br.close();
            
            
            
        }
    }
    
}
