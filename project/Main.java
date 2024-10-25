
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    
    public static void main(String[] args){
        Main m = new Main();
        System.out.println(m.replaceAllPattern("Peter went home", "e", "or"));
    }
    public String replaceAllPattern(String sentence, String pat, String newPattern){
    
        int patLength = pat.length();
        
        while(sentence.indexOf(pat) > -1){
            sentence = sentence.substring(0, sentence.indexOf(pat)) + newPattern + sentence.substring(sentence.indexOf(pat) + patLength);
            
            
        }
        return sentence;
    }
}
