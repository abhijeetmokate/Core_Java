import java.io.*;

public class FileInPutStreamInJava {
    public static void main(String[] args) throws IOException {
        FileInputStream fin= new FileInputStream("./File2.txt");
        int i;
        
        while(true)
        {
            i=fin.read();
            if(i==-1)//end of file when i=-1;
            break;
            System.out.print((char)i);

        }
        fin.close();
    }

}