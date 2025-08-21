import java.util.Scanner;
class RightTriangleRe
{
	public static void main(String[]args)
	{
		int i, j;
	Scanner sc = new Scanner (System.in);
	System.out.println("enter the value of n");
	int n = sc.nextInt();

	for(i=n;i>=1;i--)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

	
	
	}
} 