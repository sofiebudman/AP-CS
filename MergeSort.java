import java.util.ArrayList;
/**
 * Write a description of class MergeSort here.
 *
 * @author sofie Budman
 * @version 4/21
 */
public class MergeSort
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MergeSort
     */
    public MergeSort()
    {
        // initialise instance variables
        x = 0;
    }
    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> c = new ArrayList<Integer>(); 
        while(a.size() > 0 && b.size() > 0){
            if(a.get(0) > b.get(0)){
                c.add(b.get(0));
                b.remove(0);
            }else{
                c.add(a.get(0));
                a.remove(0);
            }
        }
        while(a.size() >0){
            c.add(a.get(0));
            a.remove(0);
        }
        return c;


        
    }
    public ArrayList<Integer> mergeSort(ArrayList<Integer> arr)
    {
        if (arr.size() == 1) return arr; 
        ArrayList<Integer> arrayOne = new ArrayList<Integer>(); 
        ArrayList<Integer> arrayTwo = new ArrayList<Integer>(); 
        for(int i = 0; i < arr.size()/2; i ++){
            arrayOne.add(arr.get(i));
        }
        for(int i = arr.size()/2; i < arr.size(); i ++){
            arrayTwo.add(arr.get(i));
        }
        arrayOne = mergeSort(arrayOne);
        arrayTwo = mergeSort(arrayTwo);
        return merge(arrayOne, arrayTwo);
        
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(10);
        a.add(9);
        a.add(8);
        a.add(7);
        a.add(6);
        MergeSort m = new MergeSort();
        ArrayList<Integer> c = m.mergeSort(a);
        System.out.println(c);
    }
}
