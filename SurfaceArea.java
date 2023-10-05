import java.util.*;

public class SurfaceArea {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of cone");
        double coneradius = sc.nextDouble();
        System.out.println("Enter the radius of sphere");
        double sphereradius = sc.nextDouble();
        System.out.println("Enter the height of cone");
        double coneheight = sc.nextDouble();
        double spherevolume = (4.0 / 3.0) * Math.PI * Math.pow(sphereradius, 3);
        double spheresurfacearea = 4 * Math.PI * Math.pow(sphereradius, 2);
        double conevolume = (1.0 / 3.0) * Math.PI * Math.pow(sphereradius, 2) * coneheight;
        double conesurfacearea = Math.PI * coneradius
                * (coneradius + Math.sqrt(Math.pow(coneheight, 2) + Math.pow(coneradius, 2)));
        System.out.println("The surface area of cone is:" + conesurfacearea);
        System.out.println("the volume of cone is:" + conevolume);
        System.out.println("The surfacearea of sphere is " + spheresurfacearea);
        System.out.println("The volume of sphere is" + spherevolume);
        sc.close();
    }
}