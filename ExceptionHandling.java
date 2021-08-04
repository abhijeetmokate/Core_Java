import java.util.Scanner;

/**
 * unchecked exception
 * 
 */
class DefaultThrowOurCatch
{
    public void div()
    {
        int a,b;
        int c;
        System.out.println("Enter a & b");
        Scanner scan =new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        
        try
        {
        c=a/b;
        System.out.println("Division is: "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception: "+e.getMessage());
        }
        catch(NullPointerException e1)
        {
            System.out.println("Exception: "+e1.getMessage());
        }
        finally  //there can be only one finally block 
        {
            //if we want to run certain code even if exception occur or exception is
            //not occur then we wrtie that code in this block.
            System.out.println("\"Default Throw Our Catch\" Run complete.");
        }

    }
}

class OurThrowDefaultCatch
{
    int amount;
    public void withDraw()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Amount to Withdraw:");
        amount= scan.nextInt();
        if(amount%100!=0)
        {
            //below line will throw the object which will be catch by default.
            throw new ArithmeticException("Enter the Amount in Multiples of 100");
        }

        System.out.println("Collect Your Cash.");
        System.out.println("Our theow default catch Run complete.");
    }
}

class OurThrowOurCatch
{
    int amount;
    public void withDraw()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Amount to Withdraw:");
        amount=scan.nextInt();
        try
        {
        if(amount%100!=0)
        {
            //below line will throw the object which will be catch by default.
            throw new ArithmeticException("Enter the Amount in Multiples of 100");
        }
        
        System.out.println("Collect Your Cash.");
    }

        catch(ArithmeticException e)
        {
            System.out.println("Exception: "+e.getMessage());
        }
        finally 
        {
        System.out.println("Our throw our catch Run complete.");
        }
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        DefaultThrowOurCatch obj=new DefaultThrowOurCatch();
        obj.div();
        OurThrowDefaultCatch obj1=new OurThrowDefaultCatch();
        obj1.withDraw();
        OurThrowOurCatch obj2=new OurThrowOurCatch();
        obj2.withDraw();
        
        
    }
}