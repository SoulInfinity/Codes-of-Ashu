import pack1.GCD;
import pack2.LCM;

public class packagedemo {
    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 36;
        
        int gcd = GCD.findGCD(num1, num2);
        int lcm = LCM.findLCM(num1, num2);
        
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " +lcm);
 }
}