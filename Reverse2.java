import java.util.Scanner;

class Reverse {
    public static int reverse(int num) {
         int rev = 0;
        while(num!=0)
        {
        rev = rev*10+num%10;
        num=num/10;
        }
        return rev;
    }
}

public class Reverse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        Reverse obj = new Reverse();
        int ans = obj.reverse(num);
        System.out.println(ans);
    }
}
