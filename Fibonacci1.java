import java.util.Scanner;
public class Fibonacci1 {
    public static void main(String[] args) {
        System.out.println("enter the number of terms of terms you want to print");
        Scanner sc = new Scanner(System.in);
        int term = sc.nextInt();
        int n1 = 0, n2 = 1, sum = 0;
        System.out.println(n1 + " "+n2);
        for (int i =2; i<term ; i++)
        {
            sum = n1+n2;
            System.out.println(" "+sum);
            n1=n2;
            n2=sum;
            sc.close();
            
        }
    }
}
