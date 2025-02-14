import java.util.ArrayList;
/**
 * @author Sofie Budman
 * Period 5
 * 
 */
public class Delimiters {

    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close){
        openDel = open;
        closeDel = close;

    }

    public ArrayList<String> getDelimetersList(String[] tokens){
        ArrayList<String> out = new ArrayList<String>();
        for(String t: tokens){
            if(t.equals(openDel) || t.equals(closeDel)){
                out.add(t);
            }

        }
        return out;

    }
    public boolean isBalanced (ArrayList<String> delimiters){
        int o = 0;
        int c = 0;
        for(String s: delimiters){
            if(s.equals(openDel)){
                o ++;
            } else if (s.equals(closeDel)){
                c ++;
            }
            if(c > o){
                return false;
            }

        }
        return (o == c);
    }
    public static void main(String[] args){
        Delimiters d = new Delimiters("<sup>", "</sup>");
        String[] t = {"<q>", "yy", "</q>", "zz", "</q>"};
        ArrayList<String> a = new ArrayList<String>();
        a.add("<sup>");
        a.add("</sup>");
        a.add("</sup>");
        /* 
        a.add("<sup>");
        a.add("</sup>");
        a.add("</sup>");*/

      ;
        System.out.println(d.isBalanced(a));
    }
    
}
