
/**
 * Write a description of class Average here.
 *
 * @author Sofie Budman
 * @version 1/10/2025
 */
public class Average
{
    private int[] a; 

    public Average(int min, int max, int size)
    {
        a = new int[size];
        for(int i = 0; i < a.length; i ++){
            a[i] = (int) (Math.random() * (max-min + 1) + min);
        }
 
    }
    public double getAverage(){
        int total = 0;
        for(int i: a ){
            total += i;
        }
        return (double) total / a.length;
        
    }
    
    public static void main(String[] args){

        
    }

   
}
