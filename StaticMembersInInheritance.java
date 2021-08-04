/**
 * Static members in Inheritance:
 * 1)we can inherit the static member function of superclass if they have different signature.
 * 2)static variables can not inherit.they can hide
 * 
 * Function Hiding:
 * 1)if their is a static function in super class and base class also has the static 
 * function with same signature then the function of base class hides the function of super class
 * known as function hiding.
 * 2)if the methods in super class and base class is not static then funtion overriding will takes place.
 * 
 * ++function with same signature in super class and base class both must have static or non static otherwise error will generate.
 * 
 */
class Super{
    public static int a=10;

    public static void funct()
    {
        System.out.println("Static Function of Super class");
    }

    public static void f2()
    {
        System.out.println("Static method f2 of superclass");
    }
}

class Base extends Super
{   
    public void f1()
    {
        System.out.println("Value of static variable of superclass:"+a);//static variable a of superclass
    }

    public static void f2() //this method will hide the f2() of superclass.
    {
        System.out.println("Static method f2 of baseclass");
    }
} 

public class StaticMembersInInheritance {
    public static void main(String[] args) {
        
        Base obj=new Base();
        System.out.println(Base.a);//static var of superclass
        Base.funct(); //static function of superclass
        Base.f2();
    }
}