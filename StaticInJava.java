
//Note:Java File Can Not have two public classes.

/**
 * Static Keyword In Java:
 * Java can have a Static Member Variable.
 * Java can have a Static Member Function.
 * Java can not have a Static Local Variables i.e.Static Variable in the Method.
 * Java can have a Static Inner Class.
 * 
 * Static Member Variable:
 * 1)Variable declare in the class using static keyword.
 * 2)Made only once for Entire Class Irrespective of the No. of Instances.
 * 3)It Creates Even if we dont create the object of the class.
 * 4)We can access by class name i.e.ClassName.staticVariable;
 * 
 * Static Member Funcion:
 * 1)Function Declare In the class using Static Keyword.
 * 2)Static Function can only Access the Static Member of the Same Class.
 * Because they are called using the class name not by object name.
 * 3)Static Function can Be Invoked Using Class name i.e.ClassName.staticFunction();
 * 
 */
class $Static
{
    int x;//instance variable
    static int y;//static member variable of class

    void fun1()    //instance function
    {
        //static int b;-------------------//We can not declare the static member function inside the function of class
        System.out.println("Hello!!");
    }

    static void fun2()  //static member function of the class
    {
        //static int v;---------------//illegal
        System.out.println("Hello Static");
    }

    static class InnerClass  //Static Inner Class 
    {
        public static String country="INDIA";

        static void fun3()
        {
            System.out.println("Inner Class");
        }
    }
}


class StaticInJava
{
    public static void main(String[] args) {
        
        $Static obj = new $Static();
        obj.fun1();//Instance Function can be Access only through the object (i.e.Reference variable Of the Object to class) of the class
        obj.fun2();//Correct Method to Access Static Member  Function--> $Static.fun2()
        $Static.fun2();//correct method to access static member function
        $Static.InnerClass.fun3();//OuterClass.InnerClass.staticFunction => outerclass=innerclass=innerclass static member
        System.out.println($Static.InnerClass.country);//OuterClass.InnerClass.staticVariable

    }
}