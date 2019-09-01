package week5;

public class Perfect
{
    public static void main(String[] args)
    {
        int number, total = 0;
        final int Max = 1000;
        for(number = 1; number <= Max; number++)
        {
            if((number != 1) && (total == (number - 1)))//1 is subtracted from number to account for increment before comparison
                System.out.println((number - 1) + " is a perfect number");
            total = 0;//reset total
            for(int divider = 1; divider < number; divider++)
            {
                if((number % divider) == 0)
                    total += divider;
            }
        }
    }
}