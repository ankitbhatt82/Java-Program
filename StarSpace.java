class StarSpace{
	public static void main(String[] args) {
		int i, j;
		
		for(i=5; i>=1;i--){
			for(j=1;j<=5;j++)
			{
                int sum= i+j;
				if(sum%2 == 0)
				   {
					System.out.print("*");
				    }
					else
					{
						System.out.print(" ");
					}
				}
				
				System.out.println();
		}
	}
}