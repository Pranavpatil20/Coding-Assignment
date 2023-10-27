// Create an array with the values (1,2,3,4,5,6,7) and shuffle it.
import java.lang.*;
import java.util.Random;
import java.util.Arrays;

class ArraysShuffle
{
    public void RandomShuffle(int array1[] ,int len)
    {
        Random r = new Random();

        for(int i = len-1;i > 0;i--)
        {
            int j = r.nextInt(i+1);

            int temp = array1[i];
            array1[i] = array1[j];
            array1[j] = temp;
        }
        System.out.println(Arrays.toString(array1));

    }
}

public class JavaA
{
    public static void main(String args[])
    {
        int [] arr = {1,2,3,4,5,6,7};
        int no = arr.length;

        ArraysShuffle obj = new ArraysShuffle();
        obj.RandomShuffle(arr,no);

    }
}
