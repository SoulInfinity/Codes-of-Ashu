class Parent
{
    void messege()
    {
    System.out.println("This is parent Class");

    }
}
class Student extends Parent
{
    void messege()
    {
           System.out.println("This is student class");

    }
    void display()
    {
        this.messege();
        super.messege();
    }
}
public class Super2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}
