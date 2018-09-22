/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.io.Console;

/**
 *
 * @author Pro
 */
public class JavaIOSet {
    public static void main(String[] args) {
       Console c = System.console();
        System.out.println("enter a name: ");
        
     
      String name =  c.readLine();
    
        System.out.println("the name : "+ name );
        
    }
    
    //must be run with the console  , wont be able to run here
}
