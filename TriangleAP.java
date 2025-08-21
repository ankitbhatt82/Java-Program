import java.lang.Math;
class TriangleAP
{
	static int area()
	{
		int A;
		int a=3;
		int b=4;
		int c=5;
		int s=((a+b+c)/2);
		A =(s*(s-a)*(s-b)*(s-c));
		int Area = (int)Math.sqrt(A);
		return A;

	}
	static int peri ()
	{
		int P;
		int a=3;
		int b=4;
		int c=5;
		P = a+b+c;
		return P; 
	}
	public static void main(String []args)
	{
		int ar;
		int peri;
		TriangleAP t = new TriangleAP();
		ar= t.area();
        System.out.println("area is" +ar);
        peri=t.peri();
        System.out.println("perimeter is " +peri);
	}
}