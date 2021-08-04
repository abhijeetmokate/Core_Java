/**
 * Inner class In Java:
 * 1)Inner class Can be private,protected,public,default
 * 
 * A)Static Inner class
 * i)Object creation = outerclassname.innerclassname obj= new outerclassname.innerclassname();
 * ii)Memebrs of the Static inner class can only access the static variable of the outer class.
 * 
 * B)Non Static Inner class
 * i)Object creation= 1)create the object of the outerclass first.-->Outerclasname obj= new Outerclassname();
 *                    2)then crate the object of innerclass.  --->outerclassname.innerclassname obj2= obj.new innerclass();
 * ii)Members of the non static inner class can access the instance member of outer class.
 * 
 */

 class OuterClass
 {
     int a=10;
     int b=30;
     static class StaticInnerClass
     {
        void staticInnerClassFunction()
        {
            System.out.println("This is the Function of the Static Inner Class..");
        }

     }

     class InnerClassInJava
     {
        void innerClassFunction()
        {
            System.out.println("This is the FUnction of the Non Static Inner class..");
            System.out.println("a= "+a);
        }
     }
 }
public class InnerClassInJava {

    public static void main(String[] args) {
        //Object of the Static inner class
        OuterClass.StaticInnerClass obj1=new OuterClass.StaticInnerClass();
        obj1.staticInnerClassFunction();

        //object of the Non static inner class.
        //need to create the the object of the outer class.
        OuterClass obj=new OuterClass();
        OuterClass.InnerClassInJava obj2 = obj.new InnerClassInJava();
        obj2.innerClassFunction();

    }

}