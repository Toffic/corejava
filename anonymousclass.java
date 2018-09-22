package core;



public class anonymousclass{
    
  static  void method (master m){
        m.calcarea();
    }
    
    public static void main(String[] args) {
        
      //  method (new slave());
        method (new slave (){
           public void calcarea(){
               System.out.println("the value  from the anonymous: ");
           } 
        });
        
        
    }
}




class slave implements master{

    @Override
    public void calcarea() {
        System.out.println("the slave driver: ");
    }
    
    
}





interface master {
    void calcarea();
}