abstract class Marks{
abstract int getPercentage();
}
class A extends Marks{
int a,b,c;
A(int a, int b, int c){
this.a = a;
this.b = b;
this.c = c;
}
int getPercentage(){
int average;
average = (a+b+c)/3;
return average;
}
}

class B extends Marks{
int a,b,c,d;
B(int a, int b, int c, int d){
this.a = a;
this.b = b;
this.c = c;
this.d = d;
}
int getPercentage(){
int average1;
average1 = (a+b+c+d)/4;
return average1;
}
}
class Marks9{
public static void main(String [] args)
{
A x = new A(96,99,92);
B y = new B(91,98,96,94);
System.out.println("Percentage of A is: ");
System.out.println(x.getPercentage());
System.out.println("Percentage of B is: ");
System.out.println(y.getPercentage());
}
}
