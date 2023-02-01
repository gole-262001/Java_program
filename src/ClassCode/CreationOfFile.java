package ClassCode;

import java.io.File;
import java.io.IOException;

public class CreationOfFile {

    public static void main(String[] args) {
        File myfile = new File("sample.txt");
        try{
            myfile.createNewFile ();
        }catch(IOException ie)
        {
            System.out.println(ie.getMessage());
        }
    }




}
