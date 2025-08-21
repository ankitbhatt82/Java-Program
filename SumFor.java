import java.util.Scanner;
class SumFor
{
	public static void main(String[] args) 
	{
	  int i=1;
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int sum = 0;
      
	  for(i=1; i<=n; i++)
	  {
	  	sum = sum + i; 	
	  }	
	  System.out.println("sum is " +sum);
	}
}