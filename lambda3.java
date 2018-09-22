/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Pro
 */
public class lambda3 {
    public static void main(String[] args) {
        Pojo Bright = new Pojo("Bright harmony", 35);
        Pojo cindy = new Pojo("cindy crab", 54);
        Pojo larson = new Pojo("larson anderson", 24);
        Pojo disney = new Pojo("disney cambridge", 45);
    
     List<Pojo> pojo = new ArrayList();
     pojo.add(Bright);
     pojo.add(cindy);
     pojo.add(larson);
     pojo.add(disney);
     
//     Collections.sort(pojo, new Comparator<Pojo>() {
//            @Override
//            public int compare(Pojo o1, Pojo o2) {
//
//                return o1.getName().compareTo(o2.getName());
//            }
//        });



Collections.sort(pojo, ( p1, p2)-> p1.getName().compareTo(p2.getName()));
      for(Pojo p: pojo){
          System.out.println(p.getName());
      }
     
    }
}


class Pojo {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pojo(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    private String name;
    private int id ;
}