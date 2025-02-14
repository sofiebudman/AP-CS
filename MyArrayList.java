import java.util.ArrayList;
/**
 * @author Sofie Budman
 * Period 5
 * 1/30/25
 */
public class MyArrayList {
    public ArrayList<String> addItems(String[] array){
        ArrayList<String> out = new ArrayList<String>();
        for(int i = 0; i < array.length; i++){
            out.add(array[i]);
        }
        return out;

    }
    public ArrayList<String> removeAll(ArrayList<String> list, String itemToRemove){
        for (int i = 0; i < list.size(); i ++){
            if(list.get(i).equals(itemToRemove)){
                list.remove(i);
                i --;
            }

        }
        return list;

    }
   
       
    
}
