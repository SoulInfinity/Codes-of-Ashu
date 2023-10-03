import java.io.*;
import java.io.InputStreamReader;
public class Wrapper1 {
    public static void main(String[] args)throws IOException
     {
        System.out.println("Enter a number: ");
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String a = br.readLine();
         int i = Integer.parseInt(a);
         System.out.println("The number in decimal is:"+i);
         a = Integer.toBinaryString(i);
         System.out.println("The number in binary form is:"+a);
         a=Integer.toHexString(i);
         System.out.println("The number in hexadecimal is:"+a);
         a=Integer.toOctalString(i);
         System.out.println("The number in octal form is:"+a);
         Wrapper1 obj = new Wrapper1();
         System.out.println(obj instanceof Wrapper1);
    }
}
