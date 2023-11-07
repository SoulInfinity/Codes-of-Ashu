package StringBuffer;

import java.util.Scanner;

public class Append {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value of the string ");
       String s = sc.next();
       StringBuffer sb = new StringBuffer(s);
       System.out.println("Enter the last value for the String");
       String s1 = sc.next();
       sb.append(s1); 
       System.out.println(sb);
       sc.close();
    }
}
