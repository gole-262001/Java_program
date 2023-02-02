package ClassCode;
import java.io.FileOutputStream;
public class Fileoutputstream {
    public static void main(String[] args) {

        try{
            FileOutputStream fout = new FileOutputStream("sample1.txt");
            String s="Welcome to javaTpoint.";
            byte b[]=s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        }catch(Exception e){System.out.println(e);}

    }
}
