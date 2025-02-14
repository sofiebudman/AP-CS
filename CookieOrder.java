
/**
 * Write a description of class CookieOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CookieOrder
{
    // instance variables - replace the example below with your own
    private String variety;
    private int numBoxes;

    /**
     * Constructor for objects of class CookieOrder
     */
    public CookieOrder(String variety, int numBoxes)
    {
        // initialise instance variables
        this.variety = variety;
        this.numBoxes = numBoxes;
    }

    public String getVariety()
    {
        return variety;
    }
    public int getNumBoxes()
    {
        return numBoxes;
    }
    public static void main(String[] args)
    {
        CookieOrder c1 = new CookieOrder("Oatmeal Raisin",30);
        CookieOrder c2 = new CookieOrder("Chocolate Chip", 25);
        CookieOrder c3 = new CookieOrder("Chocolate Chip", 20);
        CookieOrder c4 = new CookieOrder("Double Chocolate", 15);
        
        MasterOrder master = new MasterOrder();
        master.addOrder(c1);
        master.addOrder(c2);
        master.addOrder(c3);
        master.addOrder(c4);
        
        int total = master.getTotalBoxes();
        System.out.println("total should be 90");
        System.out.println("total: " + total);
        
        int removed = master.removeVariety("Chocolate Chip");
        System.out.println("removed should be 45");
        System.out.println("removed: " + removed);
        
        total = master.getTotalBoxes();
        System.out.println("total should be 45");
        System.out.println("total: " + total);
        
    }
}
