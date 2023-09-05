/**
 * swapping
 */
public class swapping {

    public static void main(String[] args) {
        int a = 10,b = 20;
        System.out.println("Before swapping values are "+a+" "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping the two numbers are:"+a+" "+b);
    }
}