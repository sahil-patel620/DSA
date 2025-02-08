package Recursion_Basics.Lectures;

public class PrintNumIncreasing {
    public static void printInIncreasing(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printInIncreasing(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        printInIncreasing(n);
    }
}
