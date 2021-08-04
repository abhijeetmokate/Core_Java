import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
    public static void main(String[] args) {

        try{

        InputStream inputStream=null;
        OutputStream outputStream=null;
        

File mainFile = new File("E:\\movies\\The Pursuit of Happyness (2006) (BluRay) (PC HD Full Movie).mp4");
File copyFile = new File("D:\\My Java\\IOStream\\The Pursuit of Happyness (2006).mp4");

inputStream=new FileInputStream(mainFile);
outputStream=new FileOutputStream(copyFile);

byte buffer[]=new byte[2048];
int length;

while((length= inputStream.read(buffer))>0)
outputStream.write(buffer,0,length);

inputStream.close();
outputStream.close();
        }
        catch(IOException e)
        {
            e.getStackTrace();
        }

System.out.println("File Copied SuccessFullly");





    }

}