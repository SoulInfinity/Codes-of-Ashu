interface area
{
     float pi = 3.14f;
     public float calculate(float x,float y);
}
class Rectangle implements area{
    public float calculate(float x,float y)
    {
        return x*y;
    }
}
class circle implements area{
      public float calculate(float x,float y)
      {
        return  pi*x*x;
      }
}
public class Interface1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        circle c = new circle();
        area a;
        a=c;
        System.out.println("Area of circle is: "+c.calculate(2, 4));
        a=r;
        System.out.println("The area of rectangle is :"+r.calculate(34,45));
    }
}

