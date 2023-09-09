class Details
{
    static int x =10;
    static void display()
    {
        System.out.println("This is a static method");
        System.out.println(x);
    }
    static
    {
        System.out.println("This is static block: ");
        System.out.println(x);
    }

    public static void main(String[] args) {
        System.out.println("The value of Instance variable is:");
        display();
    }
}