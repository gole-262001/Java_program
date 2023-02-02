package ClassCode;

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class Bufferoutputstream {
    public static void main(String[] args) {

        try{
            FileOutputStream fout=new FileOutputStream("testout.txt");
            BufferedOutputStream bout=new BufferedOutputStream(fout);
            String s="Welcome to javaTpoint.";
            byte b[]=s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
            System.out.println("success");

        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
