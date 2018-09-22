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
public class implementationString {
    public static void main(String[] args) {
//       String email = "tofficn@gmail.com";
//       int atsymbol = email.indexOf("@");
//       String name = email.substring(0,atsymbol);
//       String mailserver = email.substring(atsymbol+1);
//        System.out.println("Name:"+name+" MailServer: "+ mailserver);
//        
//        
        
//        String word = "this is is a typo error error or or not we we are typo is not  a this";
//        int count = 0;
//        String tofind= "is";
//        while(true)
//        {
//            count = word.indexOf(tofind, count);
//            if (count == -1) {
//                break;
//            }
//            System.out.println("the occurance of '"+ tofind + "' seen at position: "+ count);
//            count++;
 //       }
                
   /// working with palindrum
   String palin = "tod is dot";
   char c[]= palin.toCharArray();
   char cc[]= new char [palin.length()];
        for (int i = 0; i < palin.length(); i++) {
            cc[i]=c[c.length-1 -i];
        }
        String newpalin = new String (cc);
        System.out.println("value of cc "+ newpalin);
        if (newpalin.equals(palin)) {
            System.out.println("true");
            
        }else{
            System.out.println("not true");
        }
    }
}
