import java.util.Scanner;
class calculateSum{
	public static int calculateSum(int a, int b){
		int Sum = a+b;
		return Sum;
	}
	public static void main(String[]args){
		System.out.println("enter the value of a and b respectively");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int Sum=calculateSum(a,b);
		System.out.println("the sum of a and b is " +Sum);
	}
}

