/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.Vector;

/**
 *
 * @author Pro
 */
public class vectorfi {
 Vector show (){
   Vector<String> vector  = new Vector();
    for (int i = 0; i < 10; i++) {
      String name[] = {"the","boy","the","boy","the","boy","the","boy","the","boy"};
              
        vector.add(name[i]);
   
    }

return vector;
}
void show1 (){
    
    for (int i = 0; i < show().size(); i++) {
        Object o=show().get(i);
        System.out.println("o: " + o);
    }
}





public static void main(String[] args) {
//  new vectorfi().show1();    
Vector vector = new Vector();
vector.add("tt");
vector.add(5);
for(Object j:vector)
{
    if (j instanceof String) {
        String s = (String)j;
        System.out.println("string");
        System.out.println(s);
    }
    if (j instanceof Integer)   {
        int f= (int)j;
        System.out.println("int");
        System.out.println(((Integer) j).intValue());
}
        
    
  
}
}
}



