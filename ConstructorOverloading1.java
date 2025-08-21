class ConstructorOverloading1 {    
int id;  
String name;  
  
ConstructorOverloading1(){  
System.out.println("this a default constructor");  
}  
  
ConstructorOverloading1(int i, String n){  
id = i;  
name = n;  
}  
  
public static void main(String[] args) {  
ConstructorOverloading1 s = new ConstructorOverloading1(21059, "Ankit Bhatt");  
System.out.println("Default Constructor values: ");  
System.out.println("Student Id : "+s.id + " and Student Name : "+s.name);  
    
}  
} 