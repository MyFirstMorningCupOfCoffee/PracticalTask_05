package randomizer;

import java.util.Random;

public class Randomizer 
{
    private Randomizer()
    {
        
    }
    
    public static boolean flipCoin()
    {
        return new Random().nextBoolean();
    }
    
    public static String flipCoin(String side1name, String side2name)
    {
        boolean result = new Random().nextBoolean();
        
        return result ? side1name : side2name;
    }
}
