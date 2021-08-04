/**
 * Types of Access Modifiers in Java:
 * 1)Private
 * 2)Protected
 * 3)Public
 * 4)Default
 * 
 * ++ We can use access modifiers with class and its members
 * 
 * + For outer class we can use only public or default access modifier
 * + For inner class we can use any of four access modifier 
 * 
 * + Class of the one package can access the class of another package only if the class is public.
 * 
 * + Their is only one public class in one java file (outer class).
 * + The name of the java file must be same as the name of the public class.
 * + Public class can be directly accessed from the outside the package.
 * 
 * + one package can have more than one public class.
 * + to make the each public class we have to write different java file
 * 
 * Private:
 * 1)Can not access from the outside of class.
 * 2)member function of same class can access.
 * 
 * Protected:
 * 1)Member function of the same class can access protected member.
 * 2)Can be accessed by any class of the same package.
 * 3)can be accessed by the child class from another package.
 * 
 * Public:
 * Any class of any package can access.
 * 
 * Default:
 * Accessible only to the classes of same package.
 * 
 * 
 */
class Class1
{
    
    private int a=10;
    public int b=20;
    protected int c=30;
    int d=40;
}
public class AccessModifiers {
    public static void main(String[] args) {
        Class1 obj = new Class1();
        //System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }

    public void fun(){} // one outer class can have multiple public inner classes

}