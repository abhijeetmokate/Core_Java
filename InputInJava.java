import java.util.Scanner;
public class InputInJava {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String line;
        int intege;
        float f;
        double d;
        String str;
        Boolean b;
        byte bt;
        short sh;
        long lg;

        System.out.println("Enter the String");
        str=obj.next();

        System.out.println("Enter the Integer value");
        intege=obj.nextInt();

        System.out.println("Enter the String with spaces");
        obj.nextLine();
        line=obj.nextLine();

        System.out.println("Enter the float value");
        f=obj.nextFloat();

        System.out.println("Enter the double value");
        d=obj.nextDouble();

        System.out.println("Enter the Boolean value");
        b=obj.nextBoolean();

        System.out.println("Enter the byte value");
        bt=obj.nextByte();

        System.out.println("Enter the long value");
        lg=obj.nextLong();

        System.out.println("Enter the short value");
        sh=obj.nextShort();

        System.out.println(str);
        System.out.println(line);
        System.out.println(intege);
        System.out.println(f);
        System.out.println(d);
        System.out.println(b);
        System.out.println(bt);
        System.out.println(lg);
        System.out.println(sh);
    }

}