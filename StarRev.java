class StarRev
{
	public static void main(String[]args)
	{
	  int i,j;

	  for(i=1; i<=6;i++ )
	    {
	  	    for (j=6; j<=6-i; j++ )
	        {
	        	for (j=1; j<=i; j++)
	  	        System.out.print(" ");
	            System.out.println("*");
	        }
	    }
	}
}