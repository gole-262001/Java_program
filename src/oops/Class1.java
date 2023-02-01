package oops;

public class Class1 {

    public int median(int[] arr)
    {
        return (arr[1] + arr[2])/2;
    }

    public int mode(int[] arr)
    {
        int maxValue = 0, maxCount = 0, i, j;

        for (i = 0; i < 4; ++i) {
            int count = 0;
            for (j = 0; j < 4; ++j) {
                if (arr[j] == arr[i])
                    ++count;
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

}



