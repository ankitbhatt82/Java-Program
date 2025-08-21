import java.util.Scanner;
class RightTriangleNumber
{
	public static void main(String[]args)
	{
		int i, j;
		System.out.println("enter the value of n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for (j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
