package oops;

public class Class2 extends Class1 {
    public int mean(int[] arr)
    {       int sum = 0;
        for(int i = 0; i < 4 ; i++)
        {
            sum += arr[i];
        }
        return sum/4;
    }
    public double std(int arr[])
    {
        int sum = 0, standardDeviation = 0;
        int length = 4;
        for(int i = 0; i < 4 ; i++)
        {
            sum += arr[i];
        }


        int mean = sum/length;

        for(int i = 0; i < 4 ; i++) {
            standardDeviation += Math.pow(arr[i] - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }


}
