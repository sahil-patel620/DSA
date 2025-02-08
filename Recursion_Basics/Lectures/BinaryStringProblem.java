package Recursion_Basics.Lectures;

public class BinaryStringProblem {
    // using string
    public static void printBinaryStrings(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printBinaryStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryStrings(n - 1, 1, str + "1");
        }
    }

    // using StringBuilder
    public static void printBinaryStrings2(int n, int lastPlace, StringBuilder str) {
        if (n == 0) {
            System.out.println(str.toString());
            return;
        }

        StringBuilder sb1 = new StringBuilder(str);
        printBinaryStrings2(n - 1, 0, sb1.append("0"));

        if (lastPlace == 0) {
            StringBuilder sb2 = new StringBuilder(str);
            printBinaryStrings2(n - 1, 1, sb2.append("1"));
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int lastPlace = 0;
        String str = "";
        StringBuilder sb = new StringBuilder("");
        printBinaryStrings(n, lastPlace, str);
        printBinaryStrings2(n, lastPlace, sb);
    }
}
