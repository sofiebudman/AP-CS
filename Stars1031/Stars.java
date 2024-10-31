
/**
 * Write a description of class Stars here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Stars
{
    // instance variables - replace the example below with your own
    
    public Stars(){
    }
    public static void main(String[] args){
        //1,3,5,7,9 = 9 total spaces 5 rows
        //4-4,
        int numSpaces = 4;
        int numStars = 1;
        for(int i = 0; i < 5; i ++){
            for (int j = 0; j < numSpaces; j ++){
                System.out.print(" ");
                
            }
            for (int k = 0; k < numStars; k ++){
                System.out.print("*");
            }
            for (int l = 0; l < numSpaces; l++){
                System.out.print(" ");
            }
            System.out.println();
            numSpaces -= 1;
            numStars +=2;
        }
    }
    
}
