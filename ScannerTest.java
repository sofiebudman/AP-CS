import java.util.Scanner;
/**
 * Write a description of class ScannerTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScannerTest
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What grade are you in?");
        int grade = sc.nextInt();
        System.out.println("You are in the " + grade + "th grade \n");
        
        System.out.print("What is your name? ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Welcome, " + name + "\n");
        System.out.println("How much do you get in allowance per week?");
        double allowance = sc.nextDouble();
        System.out.println("Wow! " + allowance + " is a lot of money"); 
        sc.close();
    }
    // instance variables - replace the example below with your own
   
}
