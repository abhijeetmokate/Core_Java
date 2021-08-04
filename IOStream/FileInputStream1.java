import java.io.*;
public class FileInputStream1 {
    public static void main(String[] args) throws IOException {
        
        FileInputStream obj=new FileInputStream("File1.txt");
        int temp;
        while(true)
        {
        temp=obj.read();
        if(temp==-1)
        break;
        System.out.print((char)temp);
        }
        obj.close();

    }

}