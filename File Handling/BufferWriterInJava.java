/**
 * constructors of BufferWriter :-
 * 
 * 1)BufferWriter(Writer out):-
 * i)creates the buffered character output stream that uses a default size output buffer.
 * ii)parameter is the object of the writer class.
 * 
 * 2)BufferWriter(Writer out, int size):-
 * i)size parameter gives the size of output buffer.
 */
import java.io.*;

public class BufferWriterInJava {
    public static void main(String[] args) throws IOException {
        FileWriter obj=new FileWriter("./File3.txt",true);

        BufferedWriter buff=new BufferedWriter(obj);
        buff.write("Buffer Writer In Java...");

        buff.close();
    }

}