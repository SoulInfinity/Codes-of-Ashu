import java.io.*;

public class Ascii {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number: ");
        {
           int num = System.in.read();
           System.out.println("The ascii value of the code"+num);
        }
    }
}
