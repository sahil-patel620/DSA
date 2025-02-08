package Recursion_Basics.Lectures;

public class FactorialUsingRecursion {
    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 1;
        }
        int res = n * factorial(n - 1);
        return res;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        if (result == -1) {
            System.out.println("Negative number Factorial is not Possible");
        } else {
            System.out.println("Factorial = " + result);
        }
    }
}
