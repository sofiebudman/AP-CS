/**
@author Sofie Budman
Period 5
 */
import java.util.ArrayList;
public class MasterOrder {
    private ArrayList<CookieOrder> orders;
    public MasterOrder(){
        orders = new ArrayList<CookieOrder>();
    }
    public void addOrder(CookieOrder theOrder){
        orders.add(theOrder);
    }
    public int getTotalBoxes() {
        int total = 0;
        for(CookieOrder c : orders){
            total += c.getNumBoxes();

        }
        return total;

    }
    public int removeVariety(String cookieVar){
        int c = 0;
        for(int i = 0; i < orders.size(); i ++){
            if(orders.get(i).getVariety().equals(cookieVar)){
                c += orders.get(i).getNumBoxes();
                orders.remove(i);
                
                i--;
                

            }

        }
        return c; 


    }
    
}
