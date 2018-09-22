/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.io.IOException;

/**
 *
 * @author Pro
 */
public class tryblockwithresources {
    public static void main(String[] args) {
        try(fine fine1 = new fine()){
           fine1.mod(4);
            
        }   catch (Exception p ){
            System.out.println("main exception" + p);
        }
        
    }
    
    
}

class fine implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("close effeciently");

    }
    public  void mod(int a) throws IOException{
        
            if (a % 2 == 0) {
                System.out.println("mode works");
            }else
                throw new IOException ();
                    
    }

    
    
}