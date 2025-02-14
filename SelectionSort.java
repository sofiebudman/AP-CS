import java.util.ArrayList;
/**
 * Write a description of class SelectionSort here.
 *
 * @author Sofie Budman
 * Period 5
 */
public class SelectionSort
{
    // instance variables - replace the example below with your own
    private ArrayList<Integer> arr;
    /**
     * Constructor for objects of class SelectionSort
     * PostCondition: input array is not changed.
     */
    public SelectionSort(ArrayList<Integer> array)
    {
        //part A
        arr = new ArrayList<Integer>();
        for(int i: array){
            arr.add(i);
        }
        
    }

    /**
     * doSelectionSort
     *
     * @param  none
     * @return the # of times the inner loop runs.
     */
    public int doSelectionSort()
    {
        int c = 0;
        for(int i = 0; i < arr.size() -1; i++ ){
            int min = i;
            for(int j = i+1; j < arr.size(); j++){
                c++;
                if(arr.get(j) < arr.get(min)){
                    min = j;
                }

            }
            int temp = arr.set(i, arr.get(min));
            arr.set(min, temp);
        }
        return c;
        //part B
    }
    /* Do not change the following method.  
     * I need it for testing.
     */
    public ArrayList<Integer> getArray()
    {
        return arr;
    }
    public static void main(String[] args)
    {
        int[] arr = {8,10,3,2,5,7,1 };
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i: arr)
            list.add(i);
            
        SelectionSort s = new SelectionSort(list);
        int count = s.doSelectionSort();
        System.out.println(list);        //should not have changed.
        System.out.println(s.getArray());  //should be sorted.
        System.out.println(count);
        
    }
    
}
