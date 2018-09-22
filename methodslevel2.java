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
public class methodslevel2 {
    void uNlimited (int...a){
      int sum = 0;
            int count=0;
        for(int b: a){
            
               sum += b;
               System.out.print("sum " + sum);
               count++;
               System.out.print("count "+ count);
            System.out.println();
        }
        System.out.println("result "+ (sum/count));
    }
    public static void main(String[] args) {
        methodslevel2 methodslevel21 = new methodslevel2();
        methodslevel21.uNlimited(4,4,65,4,3);
    }
}
