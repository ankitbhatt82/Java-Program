class Method3 {

  public void display1() {
    System.out.println("Method without parameter");
  }

  public void display2(int a) {
    System.out.println("Method with a single parameter: " + a);
  }

  public static void main(String[] args) {
    
    Method3 obj = new Method3();

    obj.display1();
    
    obj.display2(24);
  }
}