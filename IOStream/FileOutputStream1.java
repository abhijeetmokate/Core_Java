import java.io.*;
public class FileOutputStream1 {
    public static void main(String[] args) throws IOException {
        String data="Data";
        System.out.println(data);

        FileOutputStream fos=new FileOutputStream("D:/My Java/IOStream/File1.txt",true);
        char arr[]=data.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            fos.write((int)arr[i]);
            fos.flush();
        }
        fos.close();


    }

}