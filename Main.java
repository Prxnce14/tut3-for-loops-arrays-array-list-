
// import java.util.ArrayList; 
//Packages are folders that contain a group of related pre-defined classes


public class Main
{
    public static void main(String [] args)
    {
        // //Syntax for declaring arrays : ArrayList< data type > array_name; The data types used has to be a class. primitive data types can't be used.
        // // eg of primitive : int Every primitive has a class version / a wrapper class. eg int vs Integer, float vs Float, boolean vs Boolean.
        // ArrayList<String> strlist;
        // strlist = new ArrayList<>();
        // strlist.add("Nicholas");
        // strlist.add("Britany");
        // strlist.add("Aybarinee");
        // ArrayList<Integer> intlist;
        // intlist = new ArrayList<>();
        // intlist.add(14);
        // System.out.println(intlist.get(0));
        // System.out.println(strlist.get(0));
        // System.out.println(strlist.get(1));
        // System.out.println(strlist.get(2));
        // System.out.print("length:" + " " );
        // System.out.println(strlist.size());
        // // You can also perform different operation eg .remove
        // //syntax for declaring a array 
        // int gradeslist[];
        // gradeslist = new int[10];
        // System.out.println(gradeslist.length);
        // gradeslist[0] = 10;
        // System.out.println(gradeslist[0]);
        
        // String[] Reqs = {"Nicholas","Joiles"};
        // System.out.println(Reqs[0]);
        // //syntax for for loop for(initialization; condition; increment)
        // for(int i=0; i<10; i++)
        // {
        //     System.out.println(i);
        // }

        // // for loop to go through a Array list
        // // syntax: for(data type of list, loop variable : name of list )
        // for(String name: strlist)
        // {
        //     System.out.println(name);

        // }


        int [] reqs = {6, 9};
        School uwi = new School("UWI",reqs);
        Student pg = new Student("pgaynor", uwi);
        Student jd = new Student("jdoe",uwi);
        pg.passCourse("COMP1126",0,3);
        pg.passCourse("COMP1127",0,3);
        pg.passCourse("COMP1161",1,3);
        pg.passCourse("COMP1210",1,3);
        System.out.print(pg);
        System.out.println(pg.willGraduate()?" so will graduate":" so will not graduate");

    }
}
