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
public class breakandcontinue {

    public breakandcontinue() {
    
        one :for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; System.out.println("j value"+ ++j)) {
                if(i == 5){
                    System.out.println("gotcha at: "+ i);
                     System.out.println("inside: "+ j);
                    break one ;
                   
                }
            }
           System.out.println("after for " + i);
            
        }
    
    
    }
    
}
