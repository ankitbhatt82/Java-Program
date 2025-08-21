import java.util.Scanner;
class IfElse1{
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter age");			
		int age = sc.nextInt();

		if (age<18) {
		 	System.out.println("not eligible for vote.");
		 } 
		 else if (age==18) {
		 	System.out.println("can apply for voter ID.");
		 }
		else{
			System.out.println("you can vote to your favourite candidate.");
		}
	}
}