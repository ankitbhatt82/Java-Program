class Company {
  String name;

  public Company() {
    name = "Ankit production";
  }
}

class Constructor3 {
  public static void main(String[] args) {

    Company obj = new Company();
    System.out.println("Company name = " + obj.name);
  }
}