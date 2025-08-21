import java.util.Scanner; 
class ArrOddEven
{
	public static void main(String[]args)
	{
	 Scanner input = new Scanner(System.in);
	 System.out.println("enter the size of array");
     int a=input.nextInt();
     int i,sum=0;
     int arr[]=new int[a];
     System.out.println("Enter the elements: "); 
    
         
        {  
            if(a[i]%2!=0)
           {  
              System.out.println(a[i]);  
           }
        }
  
      System.out.println("Even Numbers:");  
      for(int i=0;i<a.length;i++)
      {  
         if(a[i]%2==0)
           {  
             System.out.println(a[i]);  
            }  
       
        }
        
    }
}