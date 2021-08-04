/**
 * Generic Methods Is Same as Function Template of c++
 */
class Cls
{
    public  <E> void fun(E s[])
    {
        for(E x:s)
        {
            System.out.println(x);
        }
    }
}

public class GenericMethodJava {
    public static void main(String[] args) {
        String name[]=new String[]{"Abhijeet","Ram","Shyam","Jay"};
        Integer number[]={11,22,33,44,55};
        Cls obj=new Cls();
        obj.fun(name);
        obj.fun(number);
    }

}