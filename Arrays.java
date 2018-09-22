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
public class Arrays {

    public Arrays() {
        
        ///one dimensional//
        int [] a;
        a = new int [8];
        for (int i = 0; i < a.length; i++) {
            a[i]=i;
           
        }
//         for (int j = 0; j < a.length; j++) {
//                System.out.println(a[j]);
//            }

// a which is the array drops it members into the int data type ;that is for each for you
for(int m:a)
            System.out.println(m);

    }
    
}
