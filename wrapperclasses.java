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
public class wrapperclasses {
    public static void main(String[] args) {
        String v = "44";
        String v2 = "55";
        int x = Integer.parseInt(v);
        int m = Integer.valueOf(v2);
        Integer y = Integer.valueOf(v2);
      
        
   //     System.out.println(y.intValue() + x);
   
   Float ff = new Float(4.45f);
  float fn = ff.floatValue();
  String f= Float.toString(fn);
        System.out.println(f);
        
        
        
        String ema = "5.3f";
        float mt = Float.parseFloat(ema);
        System.out.println(mt);
        Float an = Float.parseFloat(ema);
        float mu = an.floatValue();
        System.out.println("mu "+ mu);
        float s = Float.valueOf(ema);
        System.out.println("usingthevalueof "+ s);
        
                
                
    }
}
