
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MyClient
{
        public static void main(String[] args) throws IOException {
            Socket soc=new Socket("localhost", 55535);

            System.out.println("Connecting...");
            byte bytearray[] = new byte[50000];
            InputStream inputStream= soc.getInputStream();

            OutputStream outputStream = new FileOutputStream("D:\\My Java\\IOStream\\Downloaded\\movie.mp4");

            byte buffer[]=new byte[2048];
            int length;

            while((length= inputStream.read(buffer))>0)
            outputStream.write(buffer,0,length);


            System.out.println("Done movie");

            outputStream.close();
            soc.close();

            
            
        }
}