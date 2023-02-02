package oops;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.*;

class Student implements Serializable {
    int id ;
     String name;
     public Student(int id , String name)
     {
         this.id = id;
         this.name = name;
     }
}
public class Serialization {
    public static void main(String[] args) {
        try{
            Student s1 = new Student(1 , "abhishek");
            FileOutputStream fout=new FileOutputStream("sample.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("success");
        }catch(Exception exe)
        {
            System.out.println(exe.getMessage());
        }


    }

}
