import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 *
 * @author Sofie Budman
 * @version October 2024
 */
public class MagpieRunner2
{

  
    public static void main(String[] args)
    {
        Magpie2 maggie = new Magpie2();

        System.out.println(maggie.getGreeting());
        Scanner in = new Scanner(System.in);
        String statement = in.nextLine();

        while (!statement.equals("Bye"))
        {
            System.out.println(maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }
}