package pack2;

import pack1.GCD;

public class LCM {
    public static int findLCM(int a, int b) {
        int gcd = GCD.findGCD(a, b);
        return (a * b) / gcd;
    }
}
