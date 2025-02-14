import java.util.ArrayList;
/**
 * @author Sofie Budman
 * Period 5
 */
public class ClimbingClub {
    
    private ArrayList<ClimbInfo> climbList;

    public ClimbingClub(){
        climbList = new ArrayList<ClimbInfo>();

    }

    public void addClimb(String peakName, int climbTime){
        ClimbInfo c = new ClimbInfo(peakName, climbTime);
        
        int location = 0;
        for(int i = 0; i < climbList.size(); i ++){
            
            if(c.getName().compareTo(climbList.get(i).getName()) <= 0){
                location = i;
                break;
        
            }
            location = i + 1;
        }
        climbList.add(location, c);
        
    }
    public ArrayList<ClimbInfo> getClimbList()
    {
        return climbList;
    }
    public int distinctPeakNames(){
        if(climbList.size() == 0){
            return 0;
        }
        ClimbInfo currInfo = climbList.get(0);
        String prevName = currInfo.getName();
        String currName = null;
        int numNames = 1;
        for(int k = 1; k < climbList.size(); k ++){
            currInfo = climbList.get(k);
            currName = currInfo.getName();
            if(prevName.compareTo(currName) != 0){
                numNames ++;
                prevName = currName;
            }
        }
        return numNames;

    }
}
