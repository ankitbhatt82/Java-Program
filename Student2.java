interface faceA
{
    void m1();
}
  
interface faceB
{
    void m2();
}
  
interface faceC extends faceA, faceB 
{
    void m3();
}
  
class college implements faceC
{
    public void m1()
    {
        System.out.println("ankit");
    }
  
    public void m2()
    {
        System.out.println("bhatt");
    }
  
    public void m3()
    {
        System.out.println("BCA");
    }
}
    class Student2{
        public static void main (String[] args)
    {
        college ob1 = new college();
  
        ob1.m1();
        ob1.m2();
        ob1.m3();
    }
    }