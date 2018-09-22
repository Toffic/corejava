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
public class creatingownexception 
{
    static int count = 0;
    public creatingownexception() throws  nomoreobjectsexception
    {
          count ++;
        if (count >5) {
           
             throw new   nomoreobjectsexception();
        }else{
        System.out.println(count);  
        }
    }
     public static void main(String[] args)    throws  nomoreobjectsexception {
         for (int i = 0; i < 10; i++) {
             new creatingownexception();
         }
    }
    
    
}


class nomoreobjectsexception extends Exception{
    public nomoreobjectsexception(){
        super ("no more object");
    }
    
}