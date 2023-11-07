package StringBuffer;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String1");
        String s = sc.next();
        System.out.println("Enter String2");
        String s1 = sc.next();
        StringBuffer sb = new StringBuffer(s);
        sb.replace(1, 3, s1);
        System.out.println(sb);
        sc.close();
    }
}
