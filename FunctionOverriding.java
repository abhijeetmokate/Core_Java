/**
 * If Function with same name and same signature are present in super and base class then function in base class
 * will override the function in super class
 * 
 * run in cmd
 */
class A
{
    public void fun1(int a)
    {
        System.out.println("Fun1 of class A");
    }
}

class B extends A
{
    public void fun1(int a)//this function will override the function in class A
    {
        System.out.println("Fun1 of class B");
    }
}
public class FunctionOverriding {
    public static void main(String[] args) {
        B obj=new B();
        obj.fun1(5);//this will run fun1 of class B
    }
}