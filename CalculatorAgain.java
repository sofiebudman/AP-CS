
/**
 * Write a description of class CalculatorAgain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner; 

public class CalculatorAgain
{
    
    
    public int add(int num1, int num2){
        
        return (num1+num2);
    }
    public int subtract(int num1, int num2){
        
        return (num1-num2);
    }
    public int multiply(int num1, int num2){
        
        return (num1*num2);
    }
    public int divide(int num1, int num2){
        
        return (num1/num2);
    }
    public int mod(int num1, int num2){
        
        return (num1%num2);
    }
    public int exponent(double base, double exp){
        
        return (int)(Math.pow(base,exp));
    }
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CalculatorAgain c = new CalculatorAgain();
        System.out.println("Enter the first number:");
        int param1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int param2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the operator: ");
       
        String operator = sc.nextLine();
        
        if(operator.equals("+")){
            System.out.println("Answer: " + c.add(param1,param2));
        }
        else if(operator.equals("-")){
            System.out.println("Answer: "+ c.subtract(param1,param2));
        }
        else if(operator.equals("*")){
            System.out.println("Answer: "+c.multiply(param1,param2));
        }
        else if(operator.equals("/")){
            System.out.println("Answer: " + c.divide(param1,param2));
        }
        else if(operator.equals("%")){
            System.out.println("Answer: " +c.mod(param1,param2));
        }
        else if(operator.equals("^")){
            System.out.println("Answer: " +c.exponent(param1, param2));
        }
        else{
            System.out.println("Illegal Operator");
        }
        sc.close();
    }
}
