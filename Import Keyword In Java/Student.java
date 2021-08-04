package sinfo;//sinfo package will create
/**
 * creating sinfo package which will contain Student class
 * Members of the Student class are as follows
 * compilation command: javac -d . Student.java
 */
public class Student {
    private int rollno;
    private String name;

    public void setRoll(int roll)
    {
        rollno=roll;
    }
    
    public void setName(String nam)
    {
        name=nam;
    }

    public int showRoll()
    {
        return rollno;
    }

    public String showName()
    {
        return name;
    }

}