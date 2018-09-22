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
public class Bufferbuilder {
    public static void main(String[] args) {
        ///buffer is good for thread whiles builder is good for quick usage 
        //using buffer for this example
        
        String mavis = "the name of my class";
        StringBuffer stringBuffer = new StringBuffer(mavis);
        stringBuffer.append(" teacher");
        stringBuffer.append(" who taught me a lot");
       stringBuffer.toString();
        String show = new String (stringBuffer);
                
                System.out.println(show);
                
                
                
                /////working with palendrum
                
           String palin = "dot tod";
          StringBuilder stringBuilder = new StringBuilder(palin);
          stringBuilder.reverse();
       String revpalin =   stringBuilder.toString();
  
          String test = (palin.equals(revpalin))? "Equals" : "Not Equals";
          System.out.println(test);
          
    }
  
}
