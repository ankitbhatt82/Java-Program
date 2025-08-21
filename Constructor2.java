class Constructor2 {

  int i;

  private Constructor2() {
    i = 5;
    System.out.println("Constructor is called");
  }

  public static void main(String[] args) {

  Constructor2 obj = new Constructor2();
    System.out.println("Value of i: " + obj.i);
  }
}