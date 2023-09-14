class Dimension{
    Dimension()
    {
    }
    
    void print()
    {
         System.out.println("The value of variable is ");
    }
}
class Line extends Dimension{
    Line()
    {
    }
    void print1()
    {
        super.print();
    }
}
class Rectangle extends Line{
    Rectangle()
    {
        System.out.println("MECH");
    }
    void print3()
    {
        super.print1();
    }
}
public class Box  extends Rectangle{
    public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    r1.print3();
}
}
