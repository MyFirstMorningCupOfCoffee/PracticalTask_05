package by.epam.javatraining.rassolko.headsntails;

import static io.OutputWorker.emptyLine;
import static io.OutputWorker.printlnToConsole;
import static io.OutputWorker.printToConsole;
import static io.InputWorker.readIntFromConsole;

import randomizer.Randomizer;

public class HeadsOrTails 
{
    public static void main(String[] args)
    {
        showBriefing();
        
        int number = readIntFromConsole();
        if(!checkUserInput(number))
        {
            printToConsole("Sorry, wrong input :(");
            return;
        }
        
        int side1Q = 0, side2Q = 0;
        
        for(int i = 0; i < number; i++)
        {
            if(Randomizer.flipCoin())
            {
                side1Q++;
            }
        }
        
        side2Q = number - side1Q;
        
        printlnToConsole("So, the result is:",
                         "Heads: " + side1Q,
                         "Tails: " + side2Q);
        
    }
    
    
    private static void showBriefing()
    {
        printlnToConsole(
            "Greetings!", 
            "This application can flip a coin for you as many times as you want.", 
            "You can input positive integer nubers to set quantity of flips");

            emptyLine();
    }
    
    private static boolean checkUserInput(int val)
    {
        return val > 0;
    }
}
