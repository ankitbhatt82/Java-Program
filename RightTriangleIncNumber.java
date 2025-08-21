import java.util.Scanner;
class RightTriangleIncNumber
{
	public static void main(String[]args)
	{
		int i, j;
		int number = 1;
		System.out.println("enter the value of n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for (j=1;j<=i;j++)
			{
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
		
	}
}
