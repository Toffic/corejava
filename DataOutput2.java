/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Pro
 */
public class DataOutput2 {
    public static void main(String[] args) throws Exception {
//creating and writing to a file     

    DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\Pro\\Desktop\\test\\miss.txt"));
    dos.writeInt(34223);
    dos.writeInt(664);
    dos.writeInt(411);
    dos.writeInt(224);
    dos.writeInt(463);
    dos.writeInt(454);
   // dos.writeUTF("abit wise");
            DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\Pro\\Desktop\\test\\miss.txt"));
    try{
        int count =0;
     
        while(true){
            System.out.println(dis.readInt());
        }
    }   catch (Exception re){
        System.out.println("done transferring of files ");
    }
    
        
    }
    }
   

