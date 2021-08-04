
class A implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Thread A: "+i);
        }
    }
}

class B implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Thread B: "+i);
        }
    }
}

public class ThreadUsingRunnableInterface {

    public static void main(String[] args) {

        Runnable obj=new A();
        Thread t1=new Thread(obj);//constructor --> Thread(Runnable obj)
        Thread t2=new Thread(new B());//object of the class which implements runnable interface

        t1.start();
        t2.start();

       // System.out.println(t1.getPriority()+" "+t2.getPriority());
    }

}