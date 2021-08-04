
//provide the arguments after the (java CommandLineArgument)
//ex-->java CommandLineArgument arg1 arg2 arg3

public class CommandLineArgument {
    public static void main(String[] args)//args array will recieve the arguments
     {
        int sum=0;
        for(int i=0;i<args.length;i++)//args.length gives the length of array
        {
            System.out.print(args[i]+" ");
            sum=sum+Integer.parseInt(args[i]);//since the args is of string type hence to perform the addition on the args[i] we converted into int
        }
        System.out.println("\nThe Sum is:"+sum);
    }

}