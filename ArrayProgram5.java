 class ArrayProgram5
{
	public static void main(String[]args)
	{
	 
     int a[]=new int[5];
     int i, sum =0;
     a[0] =1;
     a[1]=7;
     a[2]=5;
     a[3]=6;
     a[4]=5;

       for(i=0;i<a.length;i++)
       {
         sum = sum +a[i];
       }
      System.out.println("sum is : "+sum);
     
    }
}
