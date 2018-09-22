/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author Pro
 */
public class initializationblock {
    static int x = 0;
    static {
        System.out.println("here is static"+ x);
        
    }
    {
        x= 9;
        System.out.println("here i need an object "+ x);
    }
    
    
    public static void main(String[] args) {
        initializationblock initializationblock1 = new initializationblock();
        
        
    }
    
    
    
    
}
