package Bit_Manipulation.Lectures;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n){
        boolean res = (n & (n - 1)) == 0;
        return res;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
    }
}
