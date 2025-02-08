package Recursion_Basics.Lectures;

public class Power {
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int res = x * pow(x, n - 1);
        return res;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int res = pow(x, n);
        System.out.println(res);
    }
}
