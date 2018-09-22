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
public class lambdaexpression {

    public static void main(String[] args) {

        caller((b)-> System.out.println("through my door" + b));
        
        
        caller (new myshow(){
            @Override
            public void show(int h) {
                System.out.println("from anonymous"+ h);
            }
            
        });
                
      
    }

static void caller(myshow w){
   w.show(3);
}
    
}

interface myshow {
     void show(int h);
}