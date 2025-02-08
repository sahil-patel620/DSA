package Recursion_Basics.Lectures;

public class OptimizedPower {
    public static int optimizedPow(int a, int n) {
        if (n == 0) {
            return 1;
        }

        // n = even
        int halfpow = optimizedPow(a, n / 2);
        int halfpowSq = halfpow * halfpow;

        // n = odd
        if (n % 2 != 0) {
            halfpowSq = a * halfpowSq;
        }
        return halfpowSq;
    }

    public static void main(String[] args) {
        int a = 2; 
        int n = 10;
        int res = optimizedPow(a, n);
        System.out.println(res);
    }
}
