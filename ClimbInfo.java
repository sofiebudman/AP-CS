

import java.util.ArrayList;
/**
 * Write a description of class ClimbInfo here.
 *
 * @author Ms. Sun
 * @version 02/03/2025
 */
public class ClimbInfo
{
    private String peakName;
    private int climbTime;
    
    public ClimbInfo(String peakName, int climbTime)
    {
        this.peakName = peakName;
        this.climbTime = climbTime;
    }
    public String getName()
    {
        return peakName;
    }
    public int getTime()
    {
        return climbTime;
    }
    public static void main(String[] args)
    {
        ClimbingClub c = new ClimbingClub();
        c.addClimb("Monadnock",274);
        c.addClimb("Whiteface",301);
        c.addClimb("Algonquin", 225);
        c.addClimb("Monadnock", 344);
        c.addClimb("A", 100);
        c.addClimb("Fjkdfj", 23);
        c.addClimb("Whiteface", 1);
        c.addClimb("zzzzz", 1);
        
        int count = 1;
        ArrayList<ClimbInfo> climbList = c.getClimbList();
    
        for (ClimbInfo i: climbList)
        {
            System.out.println(count + ": " + i.getName() + " - " + i.getTime() + "\n");
            count++;
        }
        
    }
}
