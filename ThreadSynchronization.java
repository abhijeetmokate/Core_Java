import java.util.Scanner;

class Account
{
    private int balance;
    public Account(int bal)
    {
        balance=bal;
    }
    public boolean isSufficientBalance(int withdraw)
    {
        if(balance>withdraw)
        return true;
        else
        return false;
    }

    public void Withdraw(int amount)
    {
        balance=balance-amount;
        System.out.println("Money Withdraw is "+amount);
        System.out.println("Current Amount In Your Account "+balance);
    }
}

class Customer implements Runnable
{
    private Account account;
    private String name;
    public Customer(Account account,String name)
    {
        this.account=account;
        this.name=name;
    }

    public void run()
    {
        Scanner scan=new Scanner(System.in);
        synchronized(account)//resource = amount 
        {
        System.out.println(name+" Enter Amount to Withdraw");
        int amt=scan.nextInt();

       if(account.isSufficientBalance(amt))
       {
           System.out.println(name);
           account.Withdraw(amt);
       }
       else
       {System.out.println("Insufficient Balance.");}
    }
    scan.close();
    }
    
}


public class ThreadSynchronization {
    public static void main(String[] args) {
        Account acc=new Account(1000);
        Customer c1=new Customer(acc,"Abhi"),c2=new Customer(acc,"Moka");
        Thread t1=new Thread(c1), t2=new Thread(c2);

        t1.start();
        t2.start();
    }

}