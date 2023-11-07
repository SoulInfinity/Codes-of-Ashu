package StringBuffer;

import java.io.*;

public class Insert {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first value for the String");
        String s = br.readLine();
        System.out.println("Enter the second value for the String");
        String s1 = br.readLine();
        StringBuffer sb = new StringBuffer(s);
        sb.insert(1, s1);
        System.out.println(sb);

    }
}
