import java.util.Scanner;
class Comparison
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the value of a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a==b)
		{
			System.out.println("a is equal to b.");
		}
		 
        else if(a>b) 
		 {
			System.out.println(" a is greater then b.");
		 }
		 else (a<b)
		 {
			System.out.println("a is less than b.");
		 }
        
	}
}