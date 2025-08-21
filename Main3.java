
interface faceA
{
    void m1();
}
  
interface faceB extends faceA
{
    void m2();
}
  

class college implements faceB
{
    
    public void m1()
    {
        System.out.println("ankit");
    }
  
    
    public void m2()
    {
        System.out.println("ncu");
    }
  class student{
    public static void main(String[]args){
         student ob1 = new student();
        ob1.m1();
        ob1.m2();
    }
  }
    

}