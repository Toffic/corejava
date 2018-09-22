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
public class Multipleforloops {

    public Multipleforloops() {
   
//    for(int k=0, y=0 ; k < 10; ++k,++y)
//            System.out.println(k +","+ y);
//    
//    

for(int x=1 ; x< 3; ++x){
    for (int i = 0; i < x; ++i) {
        System.out.println("inner: \t"+ i);
    }
   System.out.println("fl: "+ x);
} 
        
    }

}
