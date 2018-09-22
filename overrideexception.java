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
public class overrideexception {
    
    void mask  () throws Exception{
        System.out.println("the mask is off");
    }
    
    public static void main(String[] args) throws Exception {
       overrideexception ee = new face();
       ee.mask();
    }
}


class face extends overrideexception {
     @Override
     void mask () throws IOException{
         System.out.println("the mask is on");
     }
}