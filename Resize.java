interface GeometricObject{
public double getPerimeter();
public double getArea();

}
interface Resizable{
public double resize(int pe);
}

class Circle implements GeometricObject{
public double radius = 7.0;
Circle (double radius){
this.radius = radius;
}
public double getPerimeter(){
double perimeter;
perimeter = 2*3.14*radius;
return perimeter;
}

public double getArea(){
double area;
area = 3.14*(radius*radius);
return area;
}
}
class ResizableCircle extends Circle implements Resizable {
   
    ResizableCircle(double radius) {
        // System.out.println(super.radius);
    super(radius);

    }
    public double resize(int percent){
    double per;
    per = (radius * percent)/100.0;
    radius = radius + per;
        return radius;
    }

}
class Resize
{
public static void main(String[] args){
ResizableCircle r = new ResizableCircle(6);
double peri, are, perc;
int percent = 20;
peri = r.getPerimeter();
are = r.getArea();
perc = r.resize(percent);
System.out.println("Perimeter is " + peri);
System.out.println("area is " + are);
System.out.println("new radius is " + perc);
}
}