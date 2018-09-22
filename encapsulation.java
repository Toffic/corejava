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
public class encapsulation {
  
   
    
    public static void main(String[] args) {
        hide hide1 = new hide();
     //   hide1.getM(8);
       /// hide1.getN(6);
        hide1.cal(hide1, 8,6);
        
    }
   
    
}

class hide {
   
    private int m = 0;
    private int n = 0;  
    
    public void getM( int m){
        this.m = m;
    }
    public void getN (int n){
        this.n= n; 
    }
    
void cal (hide s , int m, int n){
     
      s.getM(m);
      s.getN(n);
       
        System.out.println("the result: "+ (this.n+this.m));
        
        hide hide1 = new hide();
        System.out.println("the new instance "+ (hide1.m+ hide1.n));
        
    }
}
