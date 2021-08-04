/**
 * Anonymous Class:-
 * 1)Only Inner class can be anonymous
 * 2)It is a class declared without class name
 * 3)It is the base class of superclass.
 * 4)only the members of the superclass can be acccess using the reference variable.
 */

 class SuperClass{
     public void fun()
     {
         System.out.println("Superclass..");
     }
 }

 class OuterClass
 {
     SuperClass obj=new SuperClass(){         //created the base class object which is refer by the superclass type var .it is anonumous class
        public void fun()  //overrided class
        {
            System.out.println("Anonymous class...");
        }
     };
 }

public class AnonymousClass {
    public static void main(String[] args) {
        OuterClass ob=new OuterClass();
        ob.obj.fun();
    }

}