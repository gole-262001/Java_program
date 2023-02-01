package ClassCode;

import java.io.FileWriter;
import java.io.IOException;

public class WritingInFile {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("sample.txt");
            fw.write("this is my first file");
            fw.close();
        }catch (IOException ie)
        {
            System.out.println(ie.getMessage());
        }


    }
}
