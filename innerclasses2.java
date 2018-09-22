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
public class innerclasses2 {
void show (){
    System.out.println("this is the outer:");
}

    public static void main(String[] args) {
        
        tea t = new innerclasses2().new tea();
        t.show1();
    }

class tea {
    void show (){
        System.out.println("this is the inner class: ");
    }
    
    void show1(){
        innerclasses2.this.show();
        show();
    }
}

}



