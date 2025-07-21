package Unit8Practice;

public class Animal {
    public void method1(){
        System.out.println("Animal method 1");
    }
    public void method2(){
        System.out.println("Animal method 2 ");
        System.out.println("also calls method 1");
        method1();
    }

    public static void main (String[] args){
        Animal a = new Animal();
        a.method1();
        a.method2();
        Animal d = new Dog();
        d.method1();
        d.method2();
    }
    
}
