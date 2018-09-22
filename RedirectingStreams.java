/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;

/**
 *
 * @author Pro
 */
public class RedirectingStreams {
    
    
    public static void main(String[] args) throws Exception {
        /// reading a file first
        
        /*
       System.setIn(new FileInputStream("C:\\Users\\Pro\\Desktop\\javaplace\\ROBERT.txt"));
   
       int c = 0;
       while ((c =System.in.read()) != -1){
           System.out.print((char)c);
       }
       */
       
       ////redirecting output from here to a file 
       System.setOut(new PrintStream(new FileOutputStream("C:\\Users\\Pro\\Desktop\\javaplace\\ROBERT.txt")));
        System.out.println("here is a text set to a file");
        System.out.println("let append another text to this file");
    }
    
}
