import java.util.Scanner;
class CalculateProduct{
	public static int CalculateProduct(int a, int b){
		int Mul = a*b;
		return Mul;
	}
	public static void main(String[]args){
		System.out.println("enter the value of a and b respectively");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int Mul=CalculateProduct(a,b);
		System.out.println("the sum of a and b is " +Mul);
	}
}

