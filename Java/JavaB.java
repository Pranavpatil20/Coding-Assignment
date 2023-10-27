// Enter a Roman number as input and convert it to an integer. (ex IX = 9)
import java.lang.Math;
import java.util.*;
import java.io.*;

class ConvertNumber 
{
    public int RomanToInteger(String Str)
    {
        int iSum = 0;
        for(int i = 0;i < Str.length();i++)
        {
            int s1 = NumberValue(Str.charAt(i));
            if(i+1 < Str.length())
            {
                int s2 = NumberValue(Str.charAt(i+1));
                if(s1 >= s2)
                {
                    iSum = iSum + s1;
                }
                else
                {
                    iSum = iSum - s1;
                }
            }
            else
            {
                iSum = iSum + s1;
            }
        }
        return iSum;
    }

    public int NumberValue(char rom)
    {
        if(rom == 'I')
        {
            return 1;
        }
        if(rom == 'V')
        {
            return 5;
        }
        if(rom == 'X')
        {
            return 10;
        }
        if(rom == 'L')
        {
            return 50;
        }
        if(rom == 'C')
        {
            return 100;
        }
        if(rom == 'D')
        {
            return 500;
        }
        if(rom == 'M')
        {
            return 1000;
        }
        return -1;
    }
}

public class JavaB
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Roman Number : ");
        String sValue = sobj.nextLine();

        ConvertNumber obj = new ConvertNumber();
        System.out.println("The Integer value of given roman number is:"+obj.RomanToInteger(sValue));

    }
}