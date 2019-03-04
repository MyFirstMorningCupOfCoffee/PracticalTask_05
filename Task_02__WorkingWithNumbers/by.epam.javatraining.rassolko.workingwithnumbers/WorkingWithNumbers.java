package by.epam.javatraining.rassolko.workingwithnumbers;

import static io.OutputWorker.emptyLine;
import static io.OutputWorker.printlnToConsole;
import static io.OutputWorker.printToConsole;
import static io.OutputWorker.printToConsoleTwoRowsTable;
import static io.InputWorker.readIntFromConsole;
import static numbers.Numbers.*;

import java.util.Arrays;


public class WorkingWithNumbers 
{
    public static void main(String[] args)
    {
        showBriefing();
        
        int a, b;
        printlnToConsole("Please, enter 2 natural numbers");
        printToConsole("number a: "); a = readIntFromConsole();
        printToConsole("number b: "); b = readIntFromConsole();
        
        if(!checkUserInput(a) || !checkUserInput(b))
        {
            printlnToConsole("Sorry, wrong input :(");
            return;
        }
        
        printToConsoleTwoRowsTable(
                "The biggest digit of " + a + ":", calcBiggestDigitOfNumber(a) + "",
                a + " is a palyndrome:", isPalyndrome(a) + "",
                a + " is a prime number:", isPrimeNumber(a) + "",
                a + " and " + b + " HCF:", calcHighestCommonFactor(a, b) + "",
                a + " and " + b + " LCM:", calcLeastCommonMultiple(a, b) + "",
                a + " prime factors:", Arrays.toString(calcNaturalNumberFactors(a))
        );
        
        emptyLine();
        
        int[] digFrequency = calcDigitsFrequency(a);
        printlnToConsole(a + " digits frequency:");
        for(int i = 0; i < digFrequency.length; i++)
        {
            if(digFrequency[i] > 0)
            {
                printToConsole("[" + i + "]: " + digFrequency[i] + " ");
            }
        }
        
        emptyLine();

    }
    
    private static void showBriefing()
    {
        printlnToConsole(
            "Greetings!", 
            "This application can check the natural number you input and tell you"  
                + " something interesting about it.",
            "In case we will need more than one number, we ask you to enter"
                + " 2 numbers at once, the second one will be used if needed.",
            "Keep in mind: natural number is an integer number >= 1.");

            emptyLine();
    }
     
    private static boolean checkUserInput(int val)
    {
        return val > 0;
    }
}
