import java.util.Scanner;
class AdultAge
{
	public static void main(String[]args)
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the age of person:");
	 int age = sc.nextInt();

	 if(age>18)
	 {
	 	System.out.println("person is adult");
	 }
	 else
	 {
	 	System.out.println("person is not adult");
	 	
	 }
	}
}