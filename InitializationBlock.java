/**
 * Initialization Block in Java:
 * 
 * Types:
 * 1)Instance Initialization Block -> Belongs to Instance
 * 2)Static Initialization Block -> Belongs to Class
 * 
 * a)Instance Initialization Block:
 * 1)It get called when we create the object of Class.
 * 2)We can create more than one block.
 * 3)If more than one block is present then compiler treat them as a single block.
 * 4)But exection will take place in order in which they are write.
 * 5)Initialization Block are Called before the Constructor.
 * 6)Instance Initialization Block also known as instance initializer.
 * 7)Block does not have any name.
 * 8)We can't use return keyword inside the block.
 * 9)Instance initializer are allowed to refer to the current object using this keyword.
 * 10)We can also use the super keyword in block.
 * 
 * b)Static Initialization Block:
 * 1)static keyword is use before the initialization block.
 * 2)static initialization block can only access the static member of the class.
 * 3)It get called before the creation of the first object.
 * i.e.Before we use class first time.
 * 4)Executes only once in life of class.
 * 5)Also known as static initializer.
 * 6)May be used to initialize the static class variable of class.
 * 7)We can't use return, super, this keyword inside the block.
 * 8)
 */
class Initial
{
    private int x;
    //Below is the Instance Initialization Block 
    {
        System.out.println("Instance Initialization Block Called");
        System.out.println("x="+x);
        x=5;
    }
    public static int y;
    static   //static keyword before block denotes static initialization block.
    {
        System.out.println("static Initialization Block Called");
        System.out.println("y="+y);//can only access static member of  class
    }
    //Below is the Constructor
    public Initial()
    {
        System.out.println("Constructor Called");
        System.out.println("x="+x);
    }
    //Below is the member function
    void fun()
    {
        System.out.println("Function Called");
    }
}
public class InitializationBlock {
    public static void main(String[] args) {
        //System.out.println(Initial.y);
        Initial obj1= new Initial();//x=5
        obj1.fun();
        Initial obj2 = new Initial();//x=5 since the x is instance variable 

    }
}