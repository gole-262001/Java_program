package ClassCode;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
    public static void main(String[] args) {
        try{
            FileReader fe = new FileReader("D:\\JAVA\\Java_practice\\src\\ClassCode//sample.txt");
            int  i ;
            while ((i = fe.read()) != -1){

                System.out.print((char)i);
        }
        }catch(IOException ie)
        {
            System.out.println(ie.getMessage());
        }
    }

}
