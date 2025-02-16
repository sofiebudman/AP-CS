import java.util.ArrayList;
/**
 * Write a description of class InsertionSort here.
 *
 * @author Sofie Budman
 * @version 2/14/2025
 * Period 5
 */ 
public class InsertionSort
{
    // instance variables - replace the example below with your own
    private ArrayList<Integer>arr;

    /**
     * Constructor for objects of class InsertionSort
     */
    public InsertionSort(ArrayList<Integer> arr)
    {
       this.arr = new ArrayList<Integer>();
       for(int i: arr){
        this.arr.add(i);
       }
    }

    /**
     * doInsertion Sort
     *
     * @param  none
     * @return number of swaps
     */
    public int doInsertionSort()
    {
        int c = 0;
        for (int i = 1; i < arr.size(); i ++){
            int j = i;
            while(j >0 && arr.get(j-1) > arr.get(j)){
                int t = arr.set(j, arr.get(j-1));
                arr.set(j-1, t);
                j--;
                c++;


            }
        }
        return c;
    }
    public static void main(String[] args)
    {
        ArrayList array = new ArrayList<Integer>();
        int[] oldArray = {1,-5,9,20,18,5,-7,0,2,8};
        for(int num: oldArray)
            array.add(num);
            
        InsertionSort sort = new InsertionSort(array);
        System.out.println(sort.doInsertionSort());
        System.out.println("Number of swaps should be 23");
        
        
    }
}
