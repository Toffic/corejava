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


public class exception {
static void show2 (){
  
    int c= 10; 
    while (c > -3){
try{
int f= 10/c;
        System.out.println(f);
        c--;
    } catch (ArithmeticException e ){
        System.out.println("error on while");
        c--;
    }


}
}
static void show (){
    int sj[] = new int[1];
    for (int i = 10 ; i > -10; i--) {
    try {
        int s = 10/i;
        System.out.println(s);
        sj[i]=i;
      //  System.out.println(sj[i]);
 
    }catch(ArithmeticException e){
            System.out.println("error occured "+ e);
            }catch (Exception e ){
                System.out.println("unknown ");
            }
    }

}
    public static void main(String[] args) {
     show();   
    }
}
