import java.util.Scanner;
import java.lang.Math;

class Double_Quadratic
{
	public static void main(String[]args)
	{
		Scanner sc1= new Scanner (System.in);
		System.out.println("enter the value of a,b,c");
		double a= sc1.nextInt();
		double b= sc1.nextInt();
		double c= sc1.nextInt();	

		double d= b*b-4*a*c;
		double x1=(-b+Math.sqrt(d))/(2*a);
		double x2=(-b-Math.sqrt(d))/(2*a);

        
		System.out.println("first root is" + x1 );
		System.out.println("second root is" + x2);
		
		if(d>0)
		   {
             System.out.println("equation has real roots but not equal roots.");
		   }
		   else if (d==0)
		   {
		   	 System.out.println("equation has real and equal roots.");
		   }
		   else if (d<0)
		   {
		   	 System.out.println("equation has no real roots.");
		   }
			 
		
	}
}