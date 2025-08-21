abstract class NorthCap
{
 public abstract void getName();
}
class Dean extends NorthCap
{
 public void getName()
 {
 System.out.println(" Mr. Ankit Bhatt");
}
}
class President extends NorthCap
{
 public void getName()
 {
 System.out.println(" Mr. Kartik Mahajan ");
}
}
class ClassTeacher extends NorthCap
{
 public void getName()
 {
 System.out.println("Mr. Rahul Batra ");
}
}
class NorthCapUniv
{
 public static void main(String[] args) {
  Dean D = new Dean();
 President P = new President();
 ClassTeacher C = new ClassTeacher();
D.getName();
P.getName();
C.getName();
 }
}
