/**
 * Final Keyword:
 * We can use final keyword with class, static method,instance method,instance variable,static variable,local variable.
 * 
 * 1)final Class:
 * If Class is declared as final we can not change it i.e.We can not extend it.
 * 
 * 2)final instance variable:
 * By deafault instance variable contains 0 value but final instance variable is blank variable i.e.does not contain any value.
 * final instance variable without initialization are called as blank final variable.
 * we can initialize the final instance variable through constructor ,initialization block or during declaration.
 * final variable can be assigned only once
 * 
 * 3)Final static variable:
 * final static variable is blank variable until initialized.
 * can be initilized through static block or during declaration.
 * 
 * 4)Final local variable:
 * By default local variables are blank variables but we can initialized local variable many time.
 * but final local variable can be initialize only once.
 * 
 * 5)Final method:
 * If method in super class is declared as the final method then we can not override that method.
 * 
 *  
 */
class A
{
    public final int pub=8;

    public static final int st;
    
    static
    {
        st=3;
    }

    public void fun()
    {
        int loc;// local variable (blank variable) can be initialized more than once
        final int locc=5;//can not be initialized more than one time
        loc=6;
        System.out.println(locc);
    }

    public final void funn() //we cannot override this method in base class
    {
        System.out.println("final method");
    }

}
    
final class B //this is final class and cannot be modify i.e. we cant extend this class
{
    public void fun1()
    {
        System.out.println("Final class");
    }
}



public class FinalKeyword {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.pub);
        System.out.println(A.st);
        obj.fun();
        B obj1=new B();
        obj1.fun1();

    }
}