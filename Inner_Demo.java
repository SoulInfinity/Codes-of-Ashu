class Outer
{
    static int a = 20;
    public static void show()
    {
        System.out.println("Outer class");
    }
    static class Inner
    {
        public void display()
        {
            System.out.println("Inner class");
        }
    }
}
public class Inner_Demo {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();
        Outer.Inner obj1 = new Outer.Inner();
        obj1.display();
    }
}
