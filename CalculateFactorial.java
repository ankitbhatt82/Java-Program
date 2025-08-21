import java.util.Scanner;
class CalculateFactorial{
	public static void CalculateFactorial(int n){
		int Factorial = 1;
        for(i=1; i>=1;i--){
        	Factorial = Factorial*i;
        }
        System.out.println(Factorial);
		return;
	}
	public static void main(String[]args){
		System.out.println("enter the number to find the Factorial:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		CalculateFactorial(n);
		System.out.println("the sum of a and b is " +Factorial);
	}
}

