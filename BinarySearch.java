

/**
 * Write a description of class BinarySearch here.
 *
 * @author Sofie Budman
 * Period 5
 */
public class BinarySearch
{
      
    private int min;
    private int max;

    /**
     * Constructor for objects of class BinarySearch
     * Precondition: max > min
     * Postcondition: answer is set with a random number from min to max (exclusive of max)
     */
    public BinarySearch(int min, int max)
    {
        this.min = min;
        this.max = max;
       
    }
      /**
     * doBinarySearch
     *
     * 
     * @return : the number of guesses performed before finding the answer
     * Precondition: key is a valid number in the range (min <= key <= max)
     */
    public int doBinarySearch(int key)
    {
        int low = min;
        int high = max;
        int c = 1;

        while(low <= high){
            int mid = (low+high)/2;
            if(mid == key){
                return c;
            }
            else if(mid < key){
                low = mid +1;
                c ++;
            }
            else{
                high = mid -1;
                c++;
            }

        }
        return c; 
        

    }
    public static void main(String[] args)
    {
        //start testing with 10 number, then increase to 
        // a hundred, a thousand, etc.
        int[] answers = {3,4,10};
        BinarySearch b = new BinarySearch(0,10);
        int result = b.doBinarySearch(6);
        int index = 0;
        if (answers[index] != result)
        {
           System.out.println("0,10 search error.");
           System.out.println("Expected: " + answers[index]);
           System.out.println("Result: " + result);
        }
        index++;
        BinarySearch c = new BinarySearch(0,100);
        result = c.doBinarySearch(5);
        if (answers[index] != result)
        {
           System.out.println("0,100 search error.");
           System.out.println("Expected: " + answers[index]);
           System.out.println("Result: " + result);
        }
        index++;
       
        BinarySearch d = new BinarySearch(0,1000);
        result = d.doBinarySearch(670);
        if (answers[index] != result)
        {
           System.out.println("0,1000 search error.");
           System.out.println("Expected: " + answers[index]);
           System.out.println("Result: " + result);
        }
        System.out.println("Tests Completed");
    }
}




