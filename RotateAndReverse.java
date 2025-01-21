public class RotateAndReverse {
    public String[] rotate(String[] array, int stepsToRight){
        String[] out = new String[array.length];
        for(int i = 0; i < array.length; i ++){
            int index = (i + stepsToRight) % array.length;
            out[i] = array[index];
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
    
}
