import java.io.*;
public class BufferedReaderInJava {
    public static void main(String[] args) throws IOException {
        
        System.out.println("-----------------read() Method-----------------");
        FileReader read = new FileReader("./File3.txt");
        BufferedReader obj=new BufferedReader(read);
        int i;
        while(true)
        {
            i=obj.read();
            if(i==-1)
            break;
            System.out.print((char)i);
        }
        obj.close();
        System.out.println("-----------------readLine() Method-----------------");
        FileReader read1 = new FileReader("./File3.txt");
        BufferedReader obj1=new BufferedReader(read1);
        String str;
        while(true)
        {
            str=obj1.readLine();//returns null if file ends
            if(str==null)
            break;
            System.out.println(str);
        }
        obj1.close();

        System.out.println("-----------------read(char []buf,int offset,int length) Method-----------------");
        FileReader read2 = new FileReader("./File3.txt");
        BufferedReader obj2=new BufferedReader(read2);
        char arra[] = new char[10];
        
            obj2.read(arra,4,6);//store first 6 characters in arra from index 4 of arra
            System.out.print(arra);
        
        obj2.close();

    }

}