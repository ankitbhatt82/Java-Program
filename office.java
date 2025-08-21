class Member{
	
		String name ;
		String address;
		int age;
		int salary;
	    int phone_number;

		public void printSalary(){
			System.out.println(salary);
		}
	
}
class Employee extends Member{
	String specialization;
}
class Manager extends Member{
	String department;
}
class office{
	public static void main(String[]args){
	Employee e = new Employee();
	
	e.name = "ankit";
	e. address = "janak puri,delhi";
	e.age = 18;
	e.phone_number = 9528326;
	e.salary = 12000;
	e.specialization = "web design";

    Manager m  = new Manager();
    m.name = "ankit";
	m. address = "janak puri,delhi";
	m.age = 18;
	m.phone_number = 9528326;
	m.salary = 12000;
	m.department = "web design";

	e.printSalary();
	m.printSalary();
	}
}
