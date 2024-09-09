
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;



public class Calculator
{
    
    public void add(int a, int b){
        int sum = a+b;
        System.out.println(a + " + " + b + " = " + sum);
    
    }
    public void subtract(int a, int b){
        int difference = a-b;
        System.out.println(a + " - " + b + " = " + difference);
    
    }
    public void mult(int a, int b){
        int product = a*b;
        System.out.println(a + " * " + b + " = " + product);
    
    }
    public void divide(int a, int b){
        int quotient = a/b;
        System.out.println(a + " / " + b + " = " + quotient);
    
    }
    public void mod(int a, int b){
        int remainder = a%b;
        System.out.println(a + " % " + b + " = " + remainder);
    
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        Calculator c = new Calculator();
        c.add(num1,num2);
        c.subtract(num1,num2);
        c.mult(num1,num2);
        c.divide(num1,num2);
        c.mod(num1,num2);
        sc.close();
        
    }
    

    
}
