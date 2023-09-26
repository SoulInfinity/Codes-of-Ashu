
package Experiment8;
import java.util.Scanner;
class Shape
{
    void draw()
    {
        System.out.println("Shape");
    }
    double calculateArea()
    {
        return 0.0;
    }
}
class Circle extends Shape
{
    double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }
    void draw()
    {
        System.out.println("Circle is drawn");
    }
    double calculateArea()
    {
        return Math.PI*radius*radius;
    }
}
class Square extends Shape
{
    double side;
    Square(double side)
    {
        this.side=side;
    }
    void draw()
    {
        System.out.println("Square drawm");
    }
    double calculateArea()
    {
        return side*side;
    }
}
class Triangle extends Shape
{
    double base;
    double height;
    Triangle(double base,double height)
    {
        this.base=base;
        this.height=height;
    }
    void draw()
    {
        System.out.println("Triangle is drawn");
    }
    double calculateArea()
    {
        return 0.5*base*height;
    }
}
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double a = sc.nextInt();
        Circle c = new Circle(a);
         System.out.println("Enter the side of square: ");
        double b = sc.nextInt();
        Square d = new Square(b); 
        System.out.println("Enter the base of Triangle: ");
        double e = sc.nextInt();
        System.out.println("Enter the height of triangle");
        double f = sc.nextInt();
        Triangle v = new Triangle(e, f);
        Shape obj = new Shape();
        obj.draw();
        c.draw();
        d.draw();
        v.draw();
        System.out.println(c.calculateArea());
        System.out.println(d.calculateArea());
         System.out.println(v.calculateArea());

    }
}
