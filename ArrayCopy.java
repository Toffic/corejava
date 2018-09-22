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
public class ArrayCopy {
public ArrayCopy(){
    int [] ar = new int [8];
////setting the values into the array
    for (int i = 0; i < ar.length; i++) {
        ar[i]= i;
    }
////copying the values
//1 create new array for the copy
int m [] = new int [4];
System.arraycopy(ar, 4, m, 0, m.length);
for(int a:m)
        System.out.println(a);
}    
}
