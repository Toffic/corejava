  



public class innerclasses3 {
 
   
  void show (final int cal){
   
      class master {
     
          void show1( ){
         
              System.out.println("the value of master: "+ cal);
       
          }
          
     
      }
 master n= new master();
      n.show1();
  }
 
  
    public static void main(String[] args) {
        innerclasses3 innerclasses31 = new innerclasses3();
        innerclasses31.show(78);
    }
}



