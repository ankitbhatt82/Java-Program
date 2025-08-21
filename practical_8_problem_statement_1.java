import java.util.Scanner;

class CheckArgumentException extends Exception {
}

public class practical_8_problem_statement_1 
{

    public static void main(String[] args) throws Exception
    {
        int i,sum = 0;
        if (args.length != 5)
        {
            throw new CheckArgumentException();
        }
        else
        {
            for(i=0;i<args.length;i++)
            {
                sum+=Integer.parseInt(args[i]);
            }
            System.out.println("Passed 5 Integers");
            System.out.println("the sum of elements is "+sum);
        }
    }
}