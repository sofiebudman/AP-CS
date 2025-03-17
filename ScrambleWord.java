import java.util.ArrayList;
/**
 * Write a description of class ScrambleWord here.
 *
 * @author Sofie Budman
 * Period 5 2/24/25
 */
public class ScrambleWord
{

    public static String scrambleWord(String word)
    {
        String out = "";
        for(int i = 0; i < word.length(); i ++){
            if(i < word.length() -1 && word.substring(i,i+1).equals("A") && ! word.substring(i+1,i+2).equals("A")){
                out += word.substring(i+1, i+2);
                out += word.substring(i, i+1);
                i++ ;
            }
            else{
                out += word.substring(i, i+1);
            }
         
            

        }

        return out;
    }
    //On exit: wordList should have all words unchanged (by scrambleWord) removed
    public static void scrambleOrRemove(ArrayList<String> wordList)
    {
        for(int i = 0; i < wordList.size() ; i++){
            if(scrambleWord(wordList.get(i)).equals( wordList.get(i))){
                wordList.remove(i);
                i--;
                
            }else{
                wordList.set(i, scrambleWord(wordList.get(i)));
            }

        }
        
       
    }
    public static void main(String[] argc)
    {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("TAN");
        arr.add("ABRACADABRA");
        arr.add("WHOA");
        arr.add("APPLE");
        arr.add("EGGS");
        //arr.add("AARDVARK");
        
        ScrambleWord.scrambleOrRemove(arr);
        System.out.println(arr);
        System.out.println("Expected result: TNA BARCADABARA PAPLE");
       
        
        
    }
}
