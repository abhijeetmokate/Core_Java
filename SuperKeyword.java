/**
 * inherited class conatains two local referenced variables 'this' and 'super'.
 * class B extends A
 * {
 *      public void function()
 *      {   
 *             this ->reference variable for caller object of type B (subclass)
 *              super ->reference variable for caller object of type A (superclass)
 *       }
 * }
 * 
 * Super Keyword:
 * 1) if your method override one of its superclass's method you can invoke the overridden method of superclass.
 * through the use of the super keyword
 * 2)it avoids name conflict between member variables of the superclass and subclass
 */
class Super{
    public int var=4;
    public void fun()
    {
        System.out.println("hello "+this);//caller is super of type A
    }
}

class Base extends Super{
    public int var=6;//instance variable var is overridden
    public void fun()//fun() override
    {
        System.out.println("hey");
        System.out.println(this);
        super.fun();//since the fun() in super class is overridden we can access it using super keyword.
    }

    public void pri()// methods can access the overridden variables.
    {
        int var=9;//local variable
        System.out.println("Value of local variable var of pri() method : "+var);//local var
        System.out.println("Value of var of subclass: "+this.var);//subclass var
        System.out.println("Value of var of superclass: "+super.var);//superclass var
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        //we can create the reference variable of super class type and can store the object of base class type int it
        //but then we can not access the methods of the base class.
        Base obj=new Base();
        obj.fun();
        obj.pri();
    }
}