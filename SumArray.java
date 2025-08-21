import java.util.Scanner;
class SumArray
{
   public static void main(String args[])
   {
      System.out.println("Enter the required size of the array :: ");
      Scanner s = new Scanner(System.in);
      int size = s.nextInt();
      int myArray[] = new int [size];
      int sum = 0;
      System.out.println("Enter the elements of the arrays ");
     
      for(int i=0; i<size; i++)
      {
         myArray[i] = s.nextInt();
         sum = sum + myArray[i];
      }
      System.out.println("Sum of the elements of the array ::"+sum);
      sum = 0;
      for(int i=0; i<size;)
      {
         //myArray[i] = s.nextInt();
         sum = sum + myArray[i];
         i+=2;
      }
      System.out.println("Sum of the alternate elements of the array ::"+sum);
   }
}