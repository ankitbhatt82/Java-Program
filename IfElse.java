import java.util.Scanner;
class IfElse{
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter age");			
		int age = sc.nextInt();

		if (age<18) {
		 	System.out.println("not adult");
		 } 
		 else {
		 	System.out.println("adult");
		 }
		
	}
}