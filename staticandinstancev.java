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
public class staticandinstancev {
    static int m(){
    System.out.println("static initialize");
    return 7;
}
static int mm = m();
    public static void main(String[] args) {
        
    }
}
