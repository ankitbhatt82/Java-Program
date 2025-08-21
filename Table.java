import java.util.Scanner;
class Table
{
	public static void main(String[] args) 
	{
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the number");

		int n = sc.nextInt();
		System.out.println ("table is");
		
		for (i=1; i<=10; i++)
		{
			
         System.out.println(n*i);
		}
		
	}
}