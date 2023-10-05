package Experiment9;
abstract class Shape
{
    void msg()
    {
        System.out.println("Drawing a shape");
    }
}
class Rectangle extends Shape
{
    void h1()
    {
        System.out.println("Drawing a Rectangle");
    }
}
class Circle extends Shape{
    void m()
    {
        System.out.println("Drawing a circle");
    }
}
public class Q2 {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.m();
        obj.msg();
        Rectangle obj1 = new Rectangle();
        obj1.h1();
    }
}
