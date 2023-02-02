package oops;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
public class Deserialization {

    public static void main(String[] args) {
        try{

            ObjectInputStream in=new ObjectInputStream(new FileInputStream("sample.txt"));
            Student s=(Student)in.readObject();
            //printing the data of the serialized object
            System.out.println(s.id+" "+s.name);

            in.close();
        }catch(Exception e){System.out.println(e);}
    }
}

