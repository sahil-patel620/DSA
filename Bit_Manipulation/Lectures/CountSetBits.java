package Bit_Manipulation.Lectures;

public class CountSetBits {
    public static int counterOfSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;  // right shift n by 1 bit 
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(counterOfSetBits(10));
    }
}
