package Bit_Manipulation.Practices;

public class Q2SwapWithoutNewVariable {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        System.out.println("Before Swap X = " + x + " and Y = " + y);

        // Swapping using bitwise XOR operator
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After Swap X = " + x + " and Y = " + y);
    }
}
