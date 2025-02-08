package Recursion_Basics.Lectures;

public class FibonacciUsingRecursion {
    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int res = fibo(n - 1) + fibo(n - 2);
        return res;
    }

    public static void main(String[] args) {
        int n = 10;
        int res = fibo(n);
        System.out.println("Fibonacci of " + n + " = " + res);

    }
}
