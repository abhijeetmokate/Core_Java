/**
 * constructor in inheritance:
 * 1)constructors are not inherited by subclass.
 * 2)when we create the object of the base class then the constructor of the
 * base class will run.But before that it will invoke the constructor of the 
 * super class.It takes place implicitely.
 * 3)But we can invoke the constructor of the super class explicitely using the 
 * super(); keyword at the starting of the constructor of the base class.
 * 4)If we create the parametrized constructor in super class and did not make default 
 * constructor then it is necessary to call the constructor of super class explicitely with
 * parameter e.g. super(5,3);
 * 
 */
class A
{
    int a;
    public A(int a)
    {   this.a=a;
        System.out.println("Constructor Of A");
    }
}
class B extends A
{
    int b;
    public B()
    {   
        //error will encountered if below line removed as their is no default constructor in 
        //superclass
        super(6);//explicitely call the constructor of the super class.
        System.out.println("Constructor Of B");
    }
}
public class ConstructorInInheritance {
    public static void main(String[] args) {
        B obj=new B();
    } 

}