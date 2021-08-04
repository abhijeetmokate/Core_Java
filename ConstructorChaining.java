/**
 * Constructor Chaining In Java:
 * 1)one constructor can call another constructor and so on called as constructor chaining
 * 2)one constructor can call another constructor of same class using this() keyword.
 * 3)one constructor can call another constructor of super class using super() keyword.
 * 4)one constructor can not constain both super() and this() to call construcor.
 * 5)call to constructor should be the first line of the calling class constructor.
 * 6)
 */
class Super
{
    public Super()
    {   this(3,4);//calls the constructor Super(int a,int b)
        System.out.println("Super1");
    }

    public Super(int a,int b)
    {
        System.out.println("Super2");
    }
}
class Base extends Super
{
    public Base()
    {
        this(5);//calls the constructor Base(int a)
        System.out.println("Base1");
        //this(4); we cannot put this and super here
    }

    public Base(int a)
    {
        //compiler will put super() here implicitely
        System.out.println("Base2");
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        
        Base obj=new Base();
    }
}