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
public class passingobjectconstructors {
    public static void main(String[] args) {
         test test2 = new test(4,4,4);
         test2.length(15);
         test2.width(43);
         test2.height(34);
    test test1 = new test(test2);
    test1.cal();
    }
    
}


class test {

private int l =0, w=0, h=0;

public void length(int  l){
    this.l=l;

}
public void height(int h){
    this.h=h;
}
public void width(int w){
    this.w=w;
}
   public test (test t){
       this.l=t.l;
       this.h= t.h;
       this.w= t.w;
       
               
   }

    public test(int l , int w ,int h) {
               this.l=l;
       this.h= h;
       this.w= w;
        System.out.println(l+h+w);

    }
   

public void cal(){
    System.out.println("result "+ (l+h+w));
}
}