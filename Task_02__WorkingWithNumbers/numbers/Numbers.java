package numbers;

public class Numbers 
{
    public static int calcBiggestDigitOfNumber(int number)
    {
        char[] numberAsChars = (number + "").toCharArray();
        char biggestDigit = 0;
        for(char ch : numberAsChars)
        {
            if(ch > biggestDigit)
            {
                biggestDigit = ch;
            }
        }
        
        return Integer.parseInt(biggestDigit + "");
    }
    
    public static boolean isPalyndrome(int number)
    {
        String numberAsString = number + "";
        
        String reversedNumberAsString;
        StringBuilder sb = new StringBuilder();
        for(int i = numberAsString.length() - 1; i >= 0; i--)
        {
            sb.append(numberAsString.charAt(i));
        }
        reversedNumberAsString = sb.toString();
        
        return numberAsString.equals(reversedNumberAsString);
        
    }
    
    public static boolean isPrimeNumber(int number)
    {
        int maxNumToDivide = number / 2 + 1;
        for(int i = 2; i < maxNumToDivide; i++)
        {
            if(number % i == 0)
            {
                return false;
            }
        }
        
        return true;
    }
    
    public static int[] calcNaturalNumberFactors(int number)
    {

        java.util.ArrayList<Integer> collection = new java.util.ArrayList<>();
        
        int divisor = 2;
        int currentNumber = number;
        
        while(currentNumber > 1)
        {
            while(currentNumber % divisor != 0)
            {
                divisor++;
            }
            collection.add(divisor);
            currentNumber = currentNumber / divisor;
        }
          
        int[] responce = new int[collection.size()];
        for(int i = 0; i < collection.size(); i++)
        {
            responce[i] = collection.get(i);
        }
        
        return responce;
    }
    
    public static int calcHighestCommonFactor(int a, int b)
    {
        for(int i = a > b ? b : a; i > 1; i--)
        {
            if(a % i == 0 && b % i == 0)
            {
                return i;
            }
        }
        
        return 1;
    }
    
    public static int calcLeastCommonMultiple(int a, int b)
    {
        int cap = a * b;
        for(int i = a > b ? a : b; i < cap ; i++)
        {
            if(i % a == 0 && i % b == 0)
            {
                return i;
            }
        }
        
        return a * b;
    }
    
    public static int[] calcDigitsFrequency(int number)
    {
        int[] responce = new int[10];
        
        char[] numberAsChars = (number + "").toCharArray();
        for(char ch : numberAsChars)
        {
            int addr = Integer.parseInt(ch + ""); 
            responce[addr]++;
        }
        
        return responce;
    }
}
