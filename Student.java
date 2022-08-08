import java.util.*;

public class Student 
{
    private String name;
    // Aggregation in java refers to one class having another class. eg Nicholas has an ID
    // When you have the data type from another class being declared within a class, then  aggregation is taking place.
    private School school;
    // declaration of ArrayList passed courses
    private ArrayList<Course> passedcourses;
    
    public Student( String name, School school)
    {
        this.name = name;
        this.school = school;
        //initialization of ArrayyList passed courses
        this.passedcourses = new ArrayList<>();

    }


    public String getName()
    {
        return name;
    }

    //This mehtod is suppose to add a course to the list of courses(passedcourses)
    // create a course object from  the parameters 
    public void passCourse(String courseCode, int level, int numCredits)
    {
        Course course = new Course(courseCode, level, numCredits);
        this.passedcourses.add(course);
    }

    public int countCreditsForLevel(int level)
    {   
        // initialization of local variable
        int credit_sum= 0 ;
        // for loop to go through a Array list
        // syntax: for(data type of list, loop variable : name of list )
        // We are going through the course in the list of passed courses 
        for(Course course : passedcourses)
        {   
            //This if checks if level for each course = parameter level, if yes , the individual passes the course for that level 
            if(course.getLevel() == level)
            {
                credit_sum += course.getCredits();

            } 
        }
        return credit_sum;
    }


    public boolean willGraduate()
    {
        boolean retval = true;
        // This for loops checks each level (eg.1-3) to  see if the individual has eneough credits for each level 
        for (int lev=0; lev< school.getReqs().size() ;lev++)
        {   
            // if the calculated credits is less than the required credits then the individual did not pass
            if (school.getReqForLevel(lev)>countCreditsForLevel(lev))
            {
                retval = false;
            }
        }
        return retval;

    }


    public String toString()
    {
        String str="";
        // This line is saying the individual earned(70) the number of credits at each level(73) 
        str +=name + " earned " ;
        for (int lev =0; lev < school.getReqs().size(); lev++)
        {
            str += countCreditsForLevel(lev) +" credits at level "+ lev +",";
        }
        return str;

    }


}
