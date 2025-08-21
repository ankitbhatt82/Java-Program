class Shape{
  public void shape(){
    System.out.println("This is shape");
  }
}


class Rectangle extends Shape{
  public void shape1(){
    System.out.println("This is rectangular shape");
  }
}
class Circle extends Shape{
  public void shape2(){
    System.out.println("This is circular shape");
  }
}
class Square extends Rectangle{
  public void Shape4(){
    System.out.println("Square is a Rectangle");
  }
}
class Check{
  public static void main(String[]args){
  Square sq = new Square();
  sq.shape();
  sq.shape1();
  }
}

