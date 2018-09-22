/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.Random;

/**
 *
 * @author Pro
 */
public class randomfigures {
    public static void main(String[] args) {
        Random r = new Random();
        
        for (int i = 0; i < 10; i++) {
        double t = Math.ceil(r.nextDouble()*5);
            //int t=  (int) Math.ceil( r.nextDouble()*5)+1;
       // int t =(int) Math.ceil( r.nextInt(5)+1);
        System.out.println(t);
        }
    }
}
