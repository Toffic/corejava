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
public class recursivemethod {
    int fact(int a){
        if (a == 1) {
            return 1;
        }else {
            return a * fact(--a);
        }
    }
    
    public static void main(String[] args) {
        recursivemethod recursivemethod1 = new recursivemethod();
        System.out.println( recursivemethod1.fact(5));
    }
}
