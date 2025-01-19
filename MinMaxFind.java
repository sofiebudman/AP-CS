/**
 * Sofie Budman
 * Period 5
 */
public class MinMaxFind {

    public int findMin(int[] array){
        int min = array[0];
        for(int i : array){
            if(i < min) min = i;
        }
        return min;
    }
    public int findMinIndex(int[] array){
        return findKey(array, findMin(array));
    }

    public double findMax(double[] array){
        double max = array[0];
        for(double i : array){
            if(i > max)max = i;
        }
        return max;
    }
    public int findKey(int[] array, int key){
        for(int i = 0; i < array.length; i ++){
            if(array[i] == key) return i;
        }
        return -1;
    }
    
}
