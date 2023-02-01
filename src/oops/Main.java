package oops;
import ClassCode.Airth;
public class Main {
    public static void main(String arg[])
    {
        int arr[] = {1,2,3,4};


        Class2 c = new Class2();
        Airth a = new Airth();
        System.out.println(a.add(5,2));
        System.out.println(c.std(arr));
        System.out.println(c.mean(arr));
        System.out.println(c.median(arr));
        System.out.println(c.mode(arr));

    }
}
