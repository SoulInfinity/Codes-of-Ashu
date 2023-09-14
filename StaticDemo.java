public class StaticDemo {
    static int x = 10;
    static{
        System.out.println("Static Block");
        System.out.println("The value of variable is "+x);
    }
    static void display()
    {
        System.out.println("This is static method");
        System.out.println("The value of variable is static method is: "+x);
    }
    public static void main(String[] args) {
        System.out.println("The value of static Variable is main method: "+x);
    }
}
