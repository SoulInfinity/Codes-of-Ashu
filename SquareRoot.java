import java.io.*;
public class SquareRoot {
    public static void main(String[] args) throws IOException {
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(i);
        System.out.println("Enter 4 numbers: ");
        float num1 = Integer.parseInt(br.readLine());
        float num2 = Integer.parseInt(br.readLine());
        float num3 = Integer.parseInt(br.readLine());
        float num4 = Integer.parseInt(br.readLine());
        double ans = Math.sqrt((num2-num1)*(num2-num1)+(num4-num3)*(num4-num3));
        System.out.println("the answer is: "+ans);
    }
}
