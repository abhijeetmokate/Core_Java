
/**
 * Abstract Class:
 * 1Class which can not be instantiated called as abstract class.
 * i.e.we cannot create the objects of the abstract class.
 * 2)abstract class is created using abstract keyword.
 * 3)Abstract classes use to declare common chracteristics of subclasses.
 * 4)Abstract class can only be used as the super class for other classes.
 * 5)Abstract class is just like other classes only difference is we can
 *   not create the object of the abstract class.
 * 6)we can create the reference variable of abstract class.
 * 7)Can Have constructor.
 * 8)abastract class can implement interface.
 */
abstract class Person //abstract class
{
    String name;
    int age;
    public void setValues(final int age,final String name)
    {
        this.name=name;
        this.age=age;
    }

    public int showAge()
    {
        return age;
    }

    public String showName()
    {
        return name;
    }
}

class Student extends Person
{
    
    int roll;
    public void setRoll(final int roll)
    {this.roll=roll;}

    public int showRoll()
    {return roll;}
}

class Faculty extends Person
{
    int id;
    public void setId(final int id)
    {this.id=id;}

    public int showId()
    {return id;}
}
public class AbstractClass {
    public static void main(final String[] args) {
        final Faculty f1=new Faculty();
        final Student s1=new Student();

       
        final Person p1=new Student();//created the reference variable of person and store the object of student class.

        s1.setValues(20, "Abhi");
        s1.setRoll(84);

        System.out.println("Student: "+s1.showRoll()+"  "+s1.showName()+"  "+s1.showAge());
        
        f1.setValues(45, "Moka");
        f1.setId(283);

        System.out.println("Faculty: "+f1.showId()+"  "+f1.showName()+"  "+f1.showAge());
        

    }

}