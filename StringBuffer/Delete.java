package StringBuffer;

import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String s = sc.next();
        StringBuffer sb = new StringBuffer(s);
        sb.delete(1,3);
        System.out.println(sb);
        sc.close();

        
    }
}
