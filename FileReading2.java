/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Pro
 */
public class FileReading2 {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("c:\\Users\\Pro\\Desktop\\likeme\\newname.txt");
        FileWriter fw  = new FileWriter("c:\\Users\\Pro\\Desktop\\likeme\\wot.txt");
        int count = 0;
        while (true){
            count = fr.read();
            if (count == -1) 
                break;
             fw.write(count);
        }
        
        fr.close();
        fw.close();
        System.out.println("done ");
    }
    
}
