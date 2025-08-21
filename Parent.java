 class Parent{
 	public  void ParentMethod(){
 		System.out.println("this is parent class");
 	}
 }
 class Child extends Parent{
 	public void ChildMethod(){
 		System.out.println("this is child class");
 	}
 }
 class Family{
 	public static void main(String []args){
 		Parent p = new Parent();
 		Child c = new Child();
 		p.ParentMethod();
 		c.ChildMethod();
 		c.ParentMethod();

 	}
 }