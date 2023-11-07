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
    void msg1()
    {
        System.out.println("Drawing a Rectangle");
    }
}
class Circle extends Shape{
    void msg2()
    {
        System.out.println("Drawing a circle");
    }
}
public class Q2 {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.msg2();
        obj.msg();
        Rectangle obj1 = new Rectangle();
        obj1.msg1();
    }
}
