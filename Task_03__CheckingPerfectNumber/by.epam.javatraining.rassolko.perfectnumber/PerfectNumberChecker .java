package by.epam.javatraining.rassolko.perfectnumber;

import static io.InputWorker.readIntFromConsole;
import static io.OutputWorker.emptyLine;
import static io.OutputWorker.printToConsole;
import static io.OutputWorker.printlnToConsole;
import static numbers.Numbers.isPerfect;

public class PerfectNumberChecker 
{
    public static void main(String[] args)
    {
        showBriefing();
        
        int a;
        printToConsole("Please, enter natural number: ");
        a = readIntFromConsole();

        
        if(!checkUserInput(a))
        {
            printlnToConsole("Sorry, wrong input :(");
            return;
        }
        
        printlnToConsole(a + " is a perfect number: " + isPerfect(a));

    }
    
    private static void showBriefing()
    {
        printlnToConsole(
            "Greetings!", 
            "This application can check if natural number you input is a perfect one.",  
            "Keep in mind: natural number is an integer number >= 1.");

            emptyLine();
    }
     
    private static boolean checkUserInput(int val)
    {
        return val > 0;
    }
}
