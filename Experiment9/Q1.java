package Experiment9;

interface A {
        default void m1()
        {
            System.out.println("This is Interface A");
        }
}
interface B
{
    default void m2()
    {
        System.out.println("This is Interface I2");
    }
}
class C implements A,B
{
    public void m3()
    {
        System.out.println("This is a class inside a method");
    }
}
public class Q1 {
       public static void main(String[] args) {
        C obj = new C();
        obj.m1();
        obj.m2();
        obj.m3();
       }
}
