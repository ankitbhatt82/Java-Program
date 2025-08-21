import java.util.Scanner;

class Time_Conversion
{
	public static void main(String[]args)
	{
	  Scanner sc1= new Scanner(System.in);
	  System.out.println("enter the number of minutes");
	  int Min = sc1.nextInt();
	  
	  int year = Min/(365*24*60);
	  int remyr = Min%(365*24*60);
      int month = remyr/(365/30*24*60);
      int remmon = remyr%(365/30*24*60);
      int day = remmon/(24*60);

      System.out.println("years are " +year + ", months are " +month + " and days are " +day + "." );
	}
}