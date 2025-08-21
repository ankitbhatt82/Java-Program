import java.util.Scanner;
class Rhombus
{
  public static void main(String[]args)
  {
    int i,j;
    Scanner sc1= new Scanner(System.in);

  	System.out.println("enter the no. of rows:");
    int n = sc1.nextInt();
    System.out.println("enter the symbol:");
    String c = sc1.next();

   for (i=1; i<=n; i++)
    {
      for (j=1; j<=n-i; j++)
      {
        System.out.print(" ");
      }
    
     for (j=1; j<=2*i-1 ;j++)  
     {     
  	   System.out.print(c);
      } 
      System.out.println();
    }
    for (i=n-1; i>=1; i--)
   {
     for (j=1; j<=n-i; j++)
   
      {
        System.out.print(" ");
      }
    
     for (j=1; j<=2*i-1 ;j++)  
     {     
       System.out.print(c);
      } 
      System.out.println();
    }
  } 
}