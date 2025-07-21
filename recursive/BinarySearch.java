//package recursive;

/**
 * Write a description of class BinarySearch here.
 *
 * @author Sofie Budman
 * @version 4/18/2025
 */
public class BinarySearch
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class BinarySearch
     */
    public BinarySearch()
    {
        // initialise instance variables
        x = 0;
    }

    public int binary_search(int[] array, int low, int high, int target)
    {
        int mid = (low + high)/2;
        if(low > high) return -1;
        if(array[mid] == target){
            return (mid);
        }
        else if(array[mid] < target) return binary_search(array,mid+1, high, target);
        else return binary_search(array,low, mid-1, target);

        
 
        
    }
    public static void main(String[] args)
    {
        int[] arr = {1,3,5,50,70,80,99, 100};
        BinarySearch b = new BinarySearch();
        System.out.println(b.binary_search(arr,0,arr.length-1,70));
        System.out.println("test #1: answer should be 4");
        System.out.println(b.binary_search(arr,0,arr.length-1,85));
        System.out.println("test #2: answer should be -1");
        System.out.println(b.binary_search(arr,0,arr.length-1,5));
        System.out.println("test #2: answer should be 2");
        System.out.println(b.binary_search(arr,0,arr.length-1,101));
        System.out.println("test #2: answer should be -1");
        
    }
}
