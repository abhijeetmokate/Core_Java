import java.io.*; 

public class FileOutPutStreamInJava {
    public static void main(String[] args) throws IOException{
        FileOutputStream fout=new FileOutputStream("./File2.txt",true);//(.)->current folder and(..)->parent folder
        String name="Abhijeet Mokate Rocks...";
        char ch[]=name.toCharArray();
        for(int i=0;i<ch.length;i++)
        fout.write(ch[i]);
        fout.close();
    }

}