import java.util.Scanner;
 class Area extends Shape
{

    public void RectangleArea(double lenght, double breadth) {
        System.out.printf("Rectangle area = %.2f", lenght*breadth);
        System.out.println("");
    }

    public void SquareArea(double side) {
        System.out.printf("Square area = %.2f", (side*side));
        System.out.println("");
    }

    public void CircleArea(double radius) {
        System.out.printf("Circle area = %.2f", 3.14*(radius*radius));
        System.out.println("");
    }
}
abstract class Shape {
    abstract void RectangleArea(double lenght, double width);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}



 class Abstract {
    public static void main(String[] args) {

        Area area = new Area();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length for rectangle: ");
        double len = in.nextDouble();
        System.out.print("Entrer breadth for rectangle: ");
        double bre = in.nextDouble();
        area.RectangleArea(len, bre);

        System.out.print("Enter side for square: ");
        double sid = in.nextDouble();
        area.SquareArea(sid);

        System.out.print("Enter radius for circle: ");
        double rad = in.nextDouble();
        area.CircleArea(rad);
    }
}
