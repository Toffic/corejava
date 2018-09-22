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
public class runtimetest {
    public static void main(String[] args) {
        ///tthis tutorial is ti check yhe memory utilize by boyh yhe string
        String test = "pain";
         StringBuilder st= new StringBuilder(test);
        Runtime runtime = Runtime.getRuntime();
        long starttime = System.currentTimeMillis();
      long startmem =  runtime.freeMemory();
      
        for (int i = 0; i < 10000; i++) { test += "is";}
            long endtime = System.currentTimeMillis();
            long endmemory =runtime.freeMemory();
            
            System.out.println("memory use with creation of object :"+ (startmem-endmemory));
            System.out.println("time taken with creation of object : "+ (starttime-endtime));
            
        ////now using the string builder approach
       // start =end;
        //l=r;
       
       starttime = endtime;
       startmem = endmemory;
       
        for (int i = 0; i < 10000; i++) {
            st.append("is");              }

           endtime= System.currentTimeMillis();
           endmemory= runtime.freeMemory();
        System.out.println("memory usage with string builder: "+(startmem-endmemory) );
        System.out.println("time take with string builder :"+(endtime-starttime));
    }
    
}
