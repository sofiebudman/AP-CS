
public class CodeProject
{
  
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
        CodeProject c = new CodeProject();
        System.out.println(c.replaceAllPattern("Peter went home", "e", "eeeeee"));
    }
}
