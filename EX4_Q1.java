
import java.util.Scanner;
class Shape {
    double area;

    Shape(double r) {
        area = Math.PI * r * r;
    }

    Shape(double radius, double height) {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        area = Math.PI * radius * slantHeight;
    }

    Shape(float radius, double h) {
        
           area= 2 * Math.PI * radius * h;
        
    }

    void displayArea() {
        System.out.println("Area: " + area);
    }
}

public class EX4_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        double radius = sc.nextDouble();
        Shape circle = new Shape(radius);
        circle.displayArea();
        System.out.println("Enter height of cone");
        double height = sc.nextDouble();
        System.out.println("Enter radius of cone");
        double r = sc.nextDouble();
        Shape cone = new Shape(height,r);
        cone.displayArea();
        System.out.println("Enter radius of cylinder");
        float ri = sc.nextFloat();
        System.out.println("Enter height of cylinder");
        double hi = sc.nextDouble();
        Shape cylinder = new Shape(ri,hi);
        cylinder.displayArea();
        sc.close();
    }
}
