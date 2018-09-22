/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Pro
 */
public class trycatchfinallythrows {
 
void show () throws FileNotFoundException 
{

    FileInputStream fis = new FileInputStream("fff");


}
  
void use () throws FileNotFoundException {
    
    show();
}
    

void unchecked () throws FileNotFoundException  {
    InputStream  ff = new FileInputStream("jdsd");
  DataInputStream nn= new DataInputStream(ff);
}

void vow (){
   try{
    unchecked();
   }catch (Exception e){
       System.out.println("lets catch exception: "+ e);
       
   }
}
  
void fun (){
    
    for (int i = 1; i < 10; i++) {
        int c =20/i;
        if (i == 9) {
          
        }
    }
}

    public static void main(String[] args)   {
 
        new trycatchfinallythrows().fun();
  
  
  
    }
  
    
}
