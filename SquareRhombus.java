import java.util.Scanner;
class SquareRhombus
{
	public static void main(String[]args)
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = sc.nextInt();

		for (i=1;i<=n;i++){
			int space=n-i;
			for(j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(j=1;j<=n;j++){
				System.out.print("*");
			}
			System.out.println();
		}		
	}
}