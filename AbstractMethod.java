/**
 * Abstract Method:
 * 1)An abstract class may contain the methods that has no implementation
 *   these methods are called abstract methods.
 * 2)Abstract method does not have body hence ends with semicolon.
 * e.g. abstract void method(); <--this is abstract method
 * 3)Abstract class may be or may not be conatain abstract methods.
 * 4)But the class in which abstract method is present that class must be
 * abstract class.
 * 5)If super class contains any abstract method then it is necessary to make
 * the base class abstract because abstract method from super class will inherit 
 * into base class and if method is abstract then class must abstract.
 * 6)We can override the abstract method in the class so that we can create its object.
 * 
 */
abstract class A
{
    //since this class constain abstract method it is compulsory to
    //make this class abstract.
    abstract void meth();//this is abstract method (no body)
    public String name="Abhijeet";
}
 class B extends A
{
    //since this class is inherited from the abstract class which contain
    //abstract method hence it is compulsory to make this class abstract.
    public void fun()
    {
        System.out.println("Hello "+name);
    }
    // void meth()
    // {

    // }
}
class C extends B
{
    //this class is not abstract because in this class we override & define the 
    //abstract method "meth()"
   void meth() //abstract method is override here
    {
        //some code
    }
}
public class AbstractMethod {
    public static void main(String[] args) {
        C obj=new C();//we can create the object of c since it is not abstract class.
        obj.fun();
    }

}