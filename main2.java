interface faceA
{
    void m1();
}
  
interface faceB
{
    void m2();
}
  
class sample implements faceA, faceB
{
    public void m1()
    {
        System.out.println("imple1");
    }
  
    public void m2()
    {
        System.out.println("imple2");
    }
}
  
class main2
{
    public static void main (String[] args)
    {
        sample ob1 = new sample();
        ob1.m1();
        ob1.m2();
    }
}