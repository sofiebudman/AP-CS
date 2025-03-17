import java.util.ArrayList;
/**
 * Write a description of class StringFormatter here.
 *
 * @author Sofie Budman
 * Period 5
 * @version 2/25
 */
public class StringFormatter
{
   
   public static int totalLetters(ArrayList<String> wordList)
    {
        int c = 0;
        for(String s: wordList){
            c += s.length();
        }
        return c;
       
   }
   // must use totalLetters to receive full credit
    public static int basicGapWidth(ArrayList<String> wordList, int formattedLen)
    {
        int length = totalLetters(wordList);
        return (formattedLen - length )/ (wordList.size() -1);

      
    }
   
   public static int leftoverSpaces(ArrayList<String> wordList, int formattedLen)
   {
        int length = totalLetters(wordList);
        return (formattedLen - length ) % (wordList.size()-1);
       
   }
   // must use basicGapWidth and leftoverSpaces to receive full credit
   public static String format(ArrayList<String> wordList, int formattedLen)
   {
        String out = "";
        int extra = leftoverSpaces(wordList, formattedLen);
        for(String s: wordList){
            out += s;
            for(int i = 0; i < basicGapWidth(wordList, formattedLen); i++){
                out += " ";
            }
            if(extra >0){
                out += " ";
                extra --;
            }

       }
       return out;
   }
   
   public static void main(String[] args)
   {
       ArrayList<String> arr1 = new ArrayList<String>();
      
      String correct1 = "GREEN  EGGS  AND HAM";
       String correct2 = "BEACH           BALL";

       arr1.add("GREEN");
       arr1.add("EGGS");
       arr1.add("AND");
       arr1.add("HAM");
       
       System.out.println("Test1: The following 2 lines should be the same.");
       
       System.out.println(StringFormatter.format(arr1, 20));
       System.out.println(correct1.length());
       
       ArrayList<String> arr2 = new ArrayList<String>();
       arr2.add("BEACH");
       arr2.add("BALL");
       
       System.out.println("Test2: The following 2 lines should be the same.");
       
       System.out.println(StringFormatter.format(arr2, 20));
       System.out.println(correct2);
       
       
       
   }
}
