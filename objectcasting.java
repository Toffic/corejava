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
public class objectcasting {
    public static void main(String[] args) {
       objectcasting objectcasting1 = new objectcasting();
    subdomain subdomain1 = new subdomain();
       subdomain subd = new subdomain();
 
  objectcasting1= subdomain1;
    
    
    
   subd= (subdomain) objectcasting1;  
   subd.show();
    }
  
}



class subdomain extends objectcasting {
   int c = 9;
    
    void show (){
        System.out.println("example from");
    }
    
}