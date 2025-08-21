import java.util.Scanner;
class SumInput
{
	public static void main(String[]args)
   {
     System.out.println("enter the value of a and b");
	 Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 int b = sc.nextInt();
     
	 int sum = a + b ;
	 System.out.println("sum of a and b is" +sum);
    }
}
