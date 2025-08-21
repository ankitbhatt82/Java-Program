import java.util.Scanner;
class ArrayLength{
	public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number of element you want");
	n = sc.nextInt();
	int arr[]= new int[n];
	System.out.println("Enter the elements of the array: "); 
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	
	}
}