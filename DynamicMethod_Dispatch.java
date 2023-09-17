

class A
{
     public void show()
     {
        System.out.println("In A show");
     }
}
class B extends A{
       public void show()
       {
        System.out.println("In B show");

       }
}
class C extends A
{
   public void show()
       {
        System.out.println("In C show");

       }
}


public class DynamicMethod_Dispatch {
    public static void main(String[] args) {
    A obj = new A();
        B obj1 = new B();
    C obj2 = new C();
    A ref;
    ref = obj;
    obj.show();
    ref = obj1;
    obj1.show();
    ref = obj2;
    obj2.show();
    /*Another method to illustrate by creating objects */
    obj.show();
    obj = new B();
    obj.show();
    obj = new C();
    obj.show();
    }
}
