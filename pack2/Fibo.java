package pack2;

import pack1.Fact;

public class Fibo {
    public static long calculateFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        long fibonacci = calculateFibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + fibonacci);

        long factorial = Fact.calculateFactorial(n);
        System.out.println("Factorial(" + n + ") = " + factorial);
    }
}