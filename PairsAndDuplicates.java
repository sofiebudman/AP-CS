public class PairsAndDuplicates {
    /**
     * 
     * @author sofie budman
     * period 5
     */
    public int getNumPairs(int[] array){
        int c = 0;
        for(int i = 0; i < array.length -1 ; i ++ ){
            if(array[i] == array[i+1]){
                c ++;
                i ++;
            }
        }
        return c;

    }
    public String getMostOccurElement(String[] array){
        int most = 0;
        String out = array[0];

        for(int i = 0; i < array.length; i++){
            int count = 0;
            for(int j = i; j < array.length; j ++){
                if(array[i].equals(array[j])){
                    count ++;
                }
            }
            if(count > most){
                most = count;
                out = array[i];
            }
        }
        return out;
    }
    public String getMostOccurCharacter(String myString){
        String out = myString.substring(0,1);
        int most = 0;
        for(int i = 0; i < myString.length() -1 ; i ++){
            int count = 0;
            for(int j = i; j < myString.length() -1 ; j++){
                if(myString.substring(i,i+1).equals(myString.substring(j, j+1))){
                    count ++;
                }

            }
            if(count > most){
                most = count;
                out = myString.substring(i, i+1);
            }
        }
        return out;
    }
    public static void main(String[] args){
        PairsAndDuplicates p = new PairsAndDuplicates();
        int[] c = {1,1,2,2,3};
        String[] a = {"cat", "dog", "cat", "fish", "dog", "dog"};
        String b = "aaabbbbbbbbbccccccdddddddddddddddddddd";
        System.out.println(p.getMostOccurElement(a));
        System.out.println(p.getMostOccurCharacter(b));
        System.out.println(p.getNumPairs(c));
    }
}
 