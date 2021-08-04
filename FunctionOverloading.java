/**
 * Function Overloading:
 * Two functions with same name 
 * two functions in same class
 * one function in base class one function in super class with same name
 * function overloading dont care about the return type of the function
 * if function name is same and their is diff between the type and no of arguments then its func overloading
 */
class A
{
    public void fun1(int a)//fun1 with 1 argument
    {
        System.out.println("Fun1 of class A");
    }
    
    public void fun1(int a,int b,int c)//fun1 with 2 argument
    {
        System.out.println("Fun1(int a,int b,int c) of class A");
    }
}
class B extends A{
    public void fun1(int a,int b)//fun1 with 2 argument
    {
        System.out.println("Fun1(int a,int b) of class B");
    }
}
public class FunctionOverloading {

    public static void main(String[] args) {
        
    B obj = new B();
    obj.fun1(4);
    obj.fun1(2,4);
    obj.fun1(1,2,3);
    }

}