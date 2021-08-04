import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.net.*;
import java.util.Scanner;


class Send2 implements Runnable
{
    Socket s;
    public Send2(Socket s)
    {
        this.s=s;
    }

    @Override
    public void run() {
        
        try{

            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            Scanner scan =new Scanner(System.in);
            while(true)
            {
                System.out.print("You>>");
            String st=scan.nextLine();
            dout.writeUTF(st);
            dout.flush();
            if("STOP".equals(st))
            break;
            }
            scan.close();
            s.close();


        }
        catch(Exception e)
        {

        }



    }

}

class Recieve2 implements Runnable
{
    Socket s;
    public Recieve2(Socket s)
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
        String st=(String)din.readUTF();
        if("STOP".equals(st))
        break;
        System.out.println("\nClient>>"+st);
        }
        din.close();
        s.close();
        }
        catch(Exception e)
        {

        }
        
    }
}


public class ServerSide
{
    public static void main(String[] args) throws Exception,EOFException {
        
        System.out.println("Server Started..");
        //InetAddress addr = InetAddress.getByName("");
        ServerSocket ss=new ServerSocket(54535 );
        System.out.println(ss.getLocalPort());
        Socket s= ss.accept();
       
        System.out.println("Connection Established..");
        
        Runnable ob1=new Send2(s);
        Thread tt1=new Thread(ob1);
        tt1.start();

        Runnable ob2=new Recieve2(s);
        Thread tt2=new Thread(ob2);
        tt2.start();

        //s.close();
        ss.close();

    }
}