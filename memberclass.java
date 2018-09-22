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
public class memberclass {
    public static void main(String[] args) {
        memberclass memberclass1 = new memberclass();
        memberclass1.u = 47;
        memberclass memberclass2 = new memberclass();
        memberclass2.u=48;
        
        member member1 = memberclass1.new member();
        member1.show();
    }
    
    int x = 39;
    int u = 3;
    
class member {
     
void show (){
    System.out.println("the value from within :" +(x+u) );
}    
   
}
    
}
