package Unit8Practice;

public class Sup {
    private int numSides;
    public Sup(){
       
    }
    public static void main(String[] args){
       //error
       /* 
        Sup s = new Sup();
        Sub s1 = (Sub) s;
        */

       
        Sub s = new Sub();
        Sup s1 = (Sup) s;
     
    }
        
    
}

class Sub extends Sup {
    public Sub(){
        
    }

    
}