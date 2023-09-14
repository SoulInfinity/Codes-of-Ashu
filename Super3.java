class A{
      A(){
        System.out.println("This is parent class ");
      }
}
class B extends A
{
    B()
    {
        super();
        System.out.println("This is current class");
    }
}
public class Super3 {
    public static void main(String[] args) {
        B Obj = new B();
    }
}
