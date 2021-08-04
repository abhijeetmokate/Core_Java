/**
 * Wrapper class In Java:
 * primitive data types wrapped in the class.
 * Primitive type ---> Wrapper Class
 * boolean        --->   Boolean
 * byte           --->   Byte
 * int            --->   Integer
 * float          --->   Float
 * double         --->   Double
 * char           --->   Character
 * long           --->   Long
 * short          --->   Short
 */

/**
 * Some Methods of the Wrapper Classes:
 * 1)valueOf():
 *              Static Method
 *              Return  Object Reference of Relative Wrapper Class
 *  
 * 2)parseXxx():
 *              Xxx can be any primitive type
 *              Static
 *              It will return the xxx value i.e.parseInt -> int
 *              int a = Integer.parseInt("123")
 *
 * 
 * 3)xxxValue():
 *              Instance function
 *              xxx can be primitive type
 *              Returns the Corrosponding primitive type
 *              called using the object
 *              
 * 
 */


public class WrapperClass {

    public static void main(String[] args) {
        //-----------------------------valueOf() :-
        //Integer.valueOf("123")=It will create the object of the Integer class and stores the 
        //                       value 123 as integer in object.
        Integer a = Integer.valueOf("123");
        System.out.println(a);
        Integer c = Integer.valueOf("00101",2);//valueOf(String,base) stores the 5 in decimal format
        System.out.println(c);
        Double b = Double.valueOf("3.14");//b=object
        System.out.println(b);
        Character ch = Character.valueOf('D');//ch=object
        System.out.println(ch);
        String st = String.valueOf("String");//st=object
        System.out.println(st);

        //---------------------------------parseXxx():
        //Integer.parseInt("123") = It will convert the string 123 into the int type 123
        int d= Integer.parseInt("345");//string "345" into int 345
        System.out.println(d);
        double e =Double.parseDouble("34.2");
        System.out.println(e);

        //---------------------------------xxxValue():
        //a.intValue() = It will Return the int value store in the a object of the Integer class
        int f = a.intValue();//extract the int value from the object a
        System.out.println(f);
        double g = b.doubleValue();
        System.out.println(g);
        int h = c.intValue();
        System.out.println(c);
        char ch1=ch.charValue();//'D' in instance ch to char ch1='D' 
        System.out.println(ch1);
    }

}