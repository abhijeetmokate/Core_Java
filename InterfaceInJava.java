/**
 * Interface in Java:
 * 1)Interface are created using interface keyword.
 * 2)Interfaces only contains the declaration of the method.
 * 3)Interfaces contain variable.
 * 4)All the member functions of the interface are by default public and we can not change them.
 * 5)we dont write public and abstract before function name explicitely.
 * 6)All the fields (member variables) of the interface are implicitely public static final. we cant change them.
 * 7)Interface can not be instantiated.i.e. can't create object
 * 8)Interface Do not have constructors.since the variables are static.
 * 9)If a class which is implementing interface does not override the abstract method of interface then that
 * class must be abstract class.
 * 10)One interface can extend another interface.
 * 11)one class can implement more than one interface using 'implements' keyword.
 * 12)Multiple extension is allowed when extending interface i.e.one interface can extend more than one interface.
 * 13)we can create the reference variable of interface.
 * 14)Reference variable of the interface can store the reference of the object of the class which implements that
 * interface.But we can only access the methods of that interface.
 */

interface I1
{
    int a=10; // by default public static final
    void fun1(); // by defualt abstract public
}
interface I2
{
    void fun2();
}
class A implements I1,I2 
{
    public void fun1()
    {
        System.out.println("fun1 of class A");
    }

    public void fun2()
    {
        System.out.println("fun2 of class A");
    }
}

//-----------------------------------------------------------------
interface I3 extends I1,I2
{
    void fun3();
}
class C implements I3
{
    public void fun1()
    {
        System.out.println("fun1 of class C");
    }
    public void fun2()
    {
        System.out.println("fun2 of class C");
    }
    public void fun3()
    {
        System.out.println("fun3 of class C");
    }
}

//-------------------------------------------------------------------
interface I4{
    void fun4();
}
class B extends A implements I4
{
    public void fun4()
    {
        System.out.println("fun4 of inherited class B");
    }
}
//---------------------------------------------------------------------
public class InterfaceInJava {
    public static void main(String[] args) {
        B b= new B();
        b.fun1();
        b.fun2();
        b.fun4();

        C c=new C();
        c.fun1();
        c.fun2();
        c.fun3();

        I1 i=new A();//reference variable of the I1 
        i.fun1();//can only access the methods of the I1 interface



    }

}