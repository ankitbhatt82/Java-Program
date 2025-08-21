import java.util.Scanner;
class CountEvenOddArr
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int x=input.nextInt();
        int i;
        int evencount = 0, oddcount = 0;
        int arr[]=new int[x]; 
        
        System.out.print("Enter the elements: ");

        for(i=0 ; i<x ; i++)
        {
            
        arr[i]=input.nextInt();
    
        }
        for (i=0 ; i<x ; i++)
        {
            if (arr[i]%2==0)
            {
                evencount++;
                System.out.println("Even numbers are " + arr[i]);
                
            }
            else 
            {
                oddcount++;
                System.out.println("Odd numbers are " + arr[i]);
            }
        }
        System.out.println("No. of even elements" +evencount);
        System.out.println("No. of odd elements" +oddcount);
        
    }
}      