// Check it the input is pangram or not.
//(Pangram is a sentence that contains all the alphabet from a-z).

import java.lang.*;
import java.util.*;
import java.io.*;

class PangramSentence
{
    public void PangramOrNot(String Str)
    {
        Str = Str.toLowerCase();

        boolean PresentAllLetter = true;

        for(char ch = 'a';ch <= 'z';ch++)
        {
            if(!Str.contains(String.valueOf(ch)))
            {
                PresentAllLetter = false;
                break;
            }
        }

        if(PresentAllLetter)
        {
            System.out.println("Pangram String");
        }
        else
        {
            System.out.println("Not a Pangram String");
        }
    }
}

public class JavaC
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Sentence :");
        String sValue = sobj.nextLine();

        PangramSentence obj = new PangramSentence();
        obj.PangramOrNot(sValue);

    }
}