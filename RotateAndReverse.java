public class RotateAndReverse {
    /*
     * Sofie Budman Period 5
     */
    public String[] rotate(String[] array, int stepsToRight){
        String[] out = new String[array.length];
        for(int i = 0; i < array.length; i ++){
            int index = (i + stepsToRight) % array.length;
            out[index] = array[i];
        }
        return out;
    }

    public String[] reverse(String[] array){
        String[] out = new String[array.length];
        for(int i = 0; i < array.length; i ++){
            out[i] = array[array.length - i - 1];
        }
        return out;

    }
    public static void main(String[] args){
        RotateAndReverse r = new RotateAndReverse();
        String[] a = new String[]{"a", "b", "c", "d", "e"};
        for(String s : r.rotate(a, 2)){
            System.out.println(s);
        }
        for(String s : r.reverse(a)){
            System.out.println(s);
        }
    }
    
}
