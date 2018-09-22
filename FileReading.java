
package core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileReading{
    public static void main(String[] args) throws Exception{
    // for both images and text using the fileinput/output streams 
        String path = "C:\\Users\\Pro\\Desktop\\likeme\\";
    String path2 = "C:\\Users\\Pro\\Documents\\N.jpg";
     //  File f = new File (path+"staff update.txt");
           File f = new File (path2);
       if(f.exists()){
           System.out.println("exists");
           FileInputStream fis = new FileInputStream(f);
           FileOutputStream fos = new FileOutputStream(path+"newpic.jpg",true);
           int count = 0;
           while (true){
               count =fis.read();
               if(count == -1)
                   break;
               fos.write(count);
           }
        fis.close(  );
        fos.close();
           System.out.println("done");
       }
    }
            
    
    
}
