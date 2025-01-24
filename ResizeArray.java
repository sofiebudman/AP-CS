public class ResizeArray {
    /**
     * @author Sofie Budman Period 5 
     */
    public int[] oddNumsOnly(int[] array){
        int c = 0;
        for(int i : array){
            if(i%2 !=0) c ++;
        }
        int[] out = new int[c];
        int index = 0;
        for(int i = 0; i < array.length; i ++){
            if(array[i] % 2 != 0){
                out[index] = array[i];
                index ++;
            }
        }
        return out;
    }
    public static void main(String[] args){
        ResizeArray r = new ResizeArray();
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,11};
        int[] out = r.oddNumsOnly(array);
        for(int i : out){
            System.out.println(i);
        }
    }
    
}
