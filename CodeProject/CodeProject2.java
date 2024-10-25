
/**
 * Write a description of class CodeProject2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CodeProject2
{
    // instance variables - replace the example below with your own
    public String replaceAllPattern(String sentence, String pat, String newPattern){
        String output = "";
        if(pat.equals("")){
            return("Exception: pat cannot be empty");
        }
        if(sentence == null || pat == null || newPattern == null){
            return("Exception: String parameters cannot be null");
        }
        while(sentence.indexOf(pat) > -1){
            output += sentence.substring(0, sentence.indexOf(pat));
            output += newPattern;
            sentence = sentence.substring(sentence.indexOf(pat) + pat.length());
            
        }
        return output;
    }
    public static void main(String[] args){
        CodeProject2 c = new CodeProject2();
        System.out.println(c.replaceAllPattern("aaa", "a", "aa"));
    }
}
