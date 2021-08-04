import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;
import java.util.Scanner;


class Send1 implements Runnable
{
    Socket s;
    public Send1(Socket s)
    {
        this.s=s;
    }
    @Override
    public void run() {
        
        try
        {
     
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        Scanner scan =new Scanner(System.in);
        while(true)
        {

        System.out.print("You>>");
        String msg=scan.nextLine();
        if("STOP".equals(msg))
        break;
        dout.writeUTF(msg);
        dout.flush();
        }
        scan.close();
        dout.close();
        s.close();
    }
    catch(Exception e)
    {

    }


    }
}

class Recieve1 implements Runnable
{
    Socket s;

    public Recieve1(Socket s)
    {
        this.s=s;
    }

    @Override
    public void run() {

        try
        {
            DataInputStream din=new DataInputStream(s.getInputStream());
            while(true)
            {
                String msg= din.readUTF();
                if("STOP".equals(msg))
                break;
                System.out.println("\nServer>>"+msg);
            }
            din.close();
            s.close();
        }
        catch(Exception e)
        {

        }


    }
}


public class ClientSide
{
    public static void main(String... args) throws Exception{

        InetAddress add = new InetSocketAddress(, port)
        Socket s=new Socket(,54535);

        Runnable obj1=new Send1(s);
        Thread t1=new Thread(obj1);
        t1.start();

        Runnable obj2=new Recieve1(s);
        Thread t2=new Thread(obj2);
        t2.start();
        

    }
}