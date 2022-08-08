
public class Course 
{
    private String code;
    private int numCredits;
    private int level;

    // constructor that accepts three integers
    public Course(String code, int level, int numCredits)
    {
        this.code = code;
        this.level = level;
        this.numCredits = numCredits;
        
    }

    public String getCode()
    {
        return this.code;
    }

    public int getLevel()
    {
        return this.level;
    }

    public int getCredits()
    {
        return this.numCredits;
    }
    
}
