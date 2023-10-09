import java.util.Scanner;

class Reverse {
    public static int reverse(int num) {
<<<<<<< HEAD
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
=======
         int rev = 0;
        while(num!=0)
        {
        rev = rev*10+num%10;
        num=num/10;
>>>>>>> 7709758b74bdf7919b5c96b54ea17472570dde93
        }
        return rev;
    }
}

public class Reverse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
<<<<<<< HEAD
        int ans = Reverse.reverse(num);
=======
        Reverse obj = new Reverse();
        int ans = obj.reverse(num);
>>>>>>> 7709758b74bdf7919b5c96b54ea17472570dde93
        System.out.println(ans);
    }
}
