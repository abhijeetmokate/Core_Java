import java.io.IOException;
import java.net.ServerSocket;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MyServer {

    public static void main(String[] args) throws IOException {
    
        ServerSocket soc=new ServerSocket(55535);
        System.out.println("Server Started...");

        
        

        File fileToSend=new File("D:\\My Java\\IOStream\\song.mp3");

            byte bytearray[]= new byte[(int) fileToSend.length()];

            FileInputStream fileInputStream= new FileInputStream(fileToSend);

            BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);

            bufferedInputStream.read(bytearray,0,bytearray.length);

            System.out.println("Loaded");
            Socket ss= soc.accept();
            System.out.println("Connection Established..");
            OutputStream outputStream= ss.getOutputStream();

            outputStream.write(bytearray,0,bytearray.length);
            //outputStream.write(fileToSend);

            outputStream.flush();

            outputStream.close();
            bufferedInputStream.close();



        ss.close();
        soc.close();

    }

}