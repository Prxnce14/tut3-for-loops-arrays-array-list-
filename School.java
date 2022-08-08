
import java.util.*;

public class School
{
    private String name;
    private ArrayList<Integer> gradReqs;

    public School(String name, int[] reqs)
    {
        this.name= name;
        // initialization of Array List
        gradReqs = new ArrayList<>();
        // This for lopp goes through the array reqs(line 8) and add each element (req) to the array
        for(int req: reqs)
        {
            gradReqs.add(req);
        }


    }

    public String getName()
    {
        return this.name;
    }

    public int getReqForLevel(int level)
    {
        return gradReqs.get(level);
    }

    public ArrayList<Integer> getReqs()
    {
        return this.gradReqs;
    }

}