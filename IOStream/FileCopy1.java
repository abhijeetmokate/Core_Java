import java.io.*;

import java.util.Scanner;
public class FileCopy1 {
    public static void main(String[] args) throws IOException {
        
        System.out.println("Enter the Name Of the file want to copy");
        Scanner scan=new Scanner(System.in);    
        String fileName=scan.nextLine();
        String fileNameCopy=fileName.substring(0,fileName.indexOf("."))+"(Copy)"+fileName.substring(fileName.indexOf("."));
        FileInputStream mainFile=new FileInputStream(fileName);
        FileOutputStream copiedFile=new FileOutputStream(fileNameCopy,true);

        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(copiedFile);
        BufferedWriter bufferedWriter=new BufferedWriter(outputStreamWriter);

        InputStreamReader inputStreamReader= new InputStreamReader(mainFile);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);

        String line= bufferedReader.readLine();
        while(line!=null)
        {
            bufferedWriter.append(line);
            //System.out.print(line);
            bufferedWriter.flush();
            line=bufferedReader.readLine();
        }

        bufferedReader.close();
        inputStreamReader.close();
        bufferedWriter.close();
        outputStreamWriter.close();
        copiedFile.close();
        mainFile.close();


    }

}