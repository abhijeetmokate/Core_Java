

class Operation1
{
    public int add(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
}

public class GenericClassJava {

    public static void main(String[] args) {
        
        Operation1 op=new Operation1();
        System.out.println("The sum is "+op.add(6, 7));



    }

}