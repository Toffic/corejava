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
public class multidimensionalarray {
    public multidimensionalarray(){
        int nm [][]= {{1,2,3,5,14,97}, {4,5,6},{7,8,9}};
        // 3 rows 3 columns
//        
//        for (int i = 0; i < nm.length; i++) {
//            for (int j = 0; j < nm[i].length; j++) {
//                System.out.print(nm[i][j]+"\t");
//            }
//        }
//    }

    
    for( int a []: nm){
        for( int b : a){
            System.out.print(b +"\t");
       
        }
        System.out.println();        
    }
        
    }
    
    }
