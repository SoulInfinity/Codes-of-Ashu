import java.util.*;
public class Random_number {
    public static void main(String[] args) {
        int num = (int)(Math.random()*101);
        System.out.println("Guess a number between 1 to 100");
        Scanner sc = new Scanner(System.in);
        int guess = -1;
        while(guess!=num)
        {
            System.out.println("Enter your guess: ");
            guess = sc.nextInt();
        
        if(guess==num)
        {
            System.out.println("Yay you catched the number");
        }
        else if(guess>num)
        {
            System.out.println("Your number is too high: ");
        }
        else
        {
            System.out.println("Your number is too low");
        }
    }
    sc.close();
}
}
