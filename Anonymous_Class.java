abstract class Anonymous
{
    public abstract void display();
}
public class Anonymous_Class {
    public static void main(String[] args) {
        Anonymous an = new Anonymous() {
            public void display()
            {
                System.out.println("This is the example of Anonnymous class");
            }

        };
        an.display();
    }
}
