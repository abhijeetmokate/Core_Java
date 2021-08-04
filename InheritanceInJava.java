/**
 * Inheritance in Java:
 * 1)extends keyword is use to inherit the class.
 * 2)e.g. class Subclass extends Superclass
 * 3)In Java Multiple Inheritance is not allowed. i.e.one class can have only one direct super class.
 * 4)In Java each superclass has potential for an unlimited number of subclasses.
 * 5)Private members of the superclass are not accessible by the subclass.But we can accessed indirectly i.e.through function of superclass.
 * 6)Members that have default accessibility in the superclass are also not accessible by the subclass in other package
 * i.e.superclass in one package and inherited base class in another package
 * 
 * Java Supports Three type of inheritance:
 * 1)Single Inheritance: one superclass has one base class
 * 2)Multilevel Inheritance: 
 *                           class A ->superclass of B
 *                              |
 *                           class B ->Superclass of C
 *                              |
 *                           class C
 * Hierarchical Inheritance:
 *                              class A
 *                              |      |
 *                          class B  class C
 */

class Staff {    //superclass

    private int age;  //private member
    private String name,address;

    public void setAge(int a)
    {age=a;}

    public void setName(String n)
    {name=n;}

    public void setAddress(String ad)
    {address=ad;}

    public int showAge()
    {return age;}

    public String showAddress()
    {return address;}

    public String showName()
    {return name;}
}

class Student extends Staff { //base class of Student. Can't access the private member of the Staff class

    private int rollno;

    public void setRollNo(int roll)
    {rollno=roll;}

    public int showRollNo()
    {return rollno;}
}

public class InheritanceInJava {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.setAddress("Nashik");//indirect access
        obj.setAge(20);//      indirect access to the private member age of superclass
        obj.setName("Abhijeet");
        obj.setRollNo(84);

        System.out.println("Name: "+obj.showName());//indirect access of private member name
        System.out.println("Roll No: "+obj.showRollNo());
        System.out.println("Age: "+obj.showAge());
        System.out.println("Address: "+obj.showAddress());
    }

}