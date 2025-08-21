import java.util.Scanner;
class IfElse3{
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter age");			
		int age = sc.nextInt();

		if (age<=10) {
		 	System.out.println("you are a kid");
		 } 
		 else if (age>10 & age<20) {
		 	System.out.println("you are teenager");
		 }
		else{
			System.out.println("you are adult");
		}
	}
}