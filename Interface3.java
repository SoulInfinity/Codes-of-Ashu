interface I1 {
    public abstract void show();
}

interface I2 {
    public abstract void display();
}

public class Interface3 implements I1, I2 {
    public void show() {
        System.out.println("I1");
    }

    public void display() {
        System.out.println("I2");
    }

    public static void main(String[] args) {
        Interface3 i = new Interface3();
        i.show();
        i.display();
    }
}
