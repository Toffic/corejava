/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Pro
 */
public class TheList {
private int id;
private String fname;
private String lname;

    public TheList(int id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "TheList{" + "id=" + id + ", fname=" + fname + ", lname=" + lname + '}';
    }

    public static void main(String[] args) {
//        List<TheList> tl = new ArrayList();
//        tl.add(new TheList(9,"Kwame","Addo"));
//        tl.add(new TheList(8,"Yaw","Ampadu"));
//        tl.add(new TheList(7,"George","Addo"));
//        
//       // System.out.println(tl);
//     // tl.forEach(thel -> System.out.println(thel));
//      
//      tl.set(1, new TheList(3,"Guava","Jelly"));
      
      // tl.forEach(thel -> System.out.println(thel));
      
    
        TheList joe = new TheList(1,"Joe","Ransford");
        TheList Raynold = new TheList(2,"Raynold","Twist");
        TheList Eugene = new TheList(3,"Eugene","Helbert");
        
        LinkedList<TheList> t = new LinkedList();
        t.add(joe);
        t.add(Raynold);
        t.add(Eugene);
        
       Iterator li = t.iterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }
    }
}

