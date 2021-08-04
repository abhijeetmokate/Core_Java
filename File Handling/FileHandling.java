/**
 * File Handling:
 * 1)File Handling is done by File class of io package.
 * 2)The object of the File class refers to the metadata of the file
 */
import java.io.File;//File class is present in io package.
import java.io.IOException;//
public class FileHandling {
    public static void main(String[] args) throws IOException
     {
        File f1=new File("D:/My Java/File4.txt");//object of the File class refering to the metadata of the file.
        System.out.println("Is file exist:"+f1.exists());
        if(f1.createNewFile())
        {
            System.out.println("File Created Successfully.");
        }
        System.out.println("Is file exist:"+f1.exists());
        System.out.println("Can File Write:"+f1.canWrite());
        System.out.println("File Name:"+f1.getName());
        System.out.println("Length of File:"+f1.length());
        System.out.println("Is file Deleted:"+f1.delete());
        System.out.println("Is file Deleted:"+f1.delete());
    }
}