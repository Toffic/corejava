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
public class StringBasic2 {
    public static void main(String[] args) {
//     
    String name = "DENNIS STANIS OF A PLACE";
 
    String man = new String ("acel").toUpperCase();
        if (name.contains(man)) {
            System.out.println("it contains ");
        }
        else 
        {
            System.out.println("nope");
        }
    
    
    String ternary= (name.contains(man) )? "it contains": "nope";
        System.out.println("our ternary "+ternary);
        
        
        ////////////extensions///////////
        
        String e = "file.java";
      
        String c = (e.endsWith(".java"))? "yes it contains" : "no extension";
        System.out.println("the extension aspect: " + c);
        
        //////////comparing strings with subtraction
        String a = "hallo";
        String b = "hello";
        System.out.println("comparing our strings "+a.compareTo(b));
        
        
        ///converting of strigs to byte ///
       //using string a variable
       byte []z= a.getBytes();
        for (int i = 0; i < z.length; i++) {
            System.out.println("our byte: " + z[i]);
        } 
       // using foreach
       for(byte o: z){
           System.out.println("using foreach: "+ o);
       }
       
       //// converting string to char
       
       ///using string a variable which was declared not long  ago because i like typing
       char []vh= a.toCharArray();
       for(char cj:vh){
           System.out.println("with our char: "+ cj);
       }
        //////////converting char to string 
        char []trys = {'t','h','i','s'};
       String so = new String(trys);
       
        System.out.println("the value after converting: "+ so);
  String weap =String.valueOf(trys);
        System.out.println("using the tostring method: "+ weap);
        
        
        ///working with substring
        
 String value = "This is ready to be sent off ";
        System.out.println("the substring method: "+ value.substring(8,13));
       
    }
        
        
   
}