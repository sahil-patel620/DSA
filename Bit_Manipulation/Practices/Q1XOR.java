package Bit_Manipulation.Practices;

public class Q1XOR {
    public static int XOROf(int n){
        return n^n;
    }
    public static void main(String[] args) {
        // x^x always gives 0
        int res = XOROf(5);
        System.out.println(res);
    }
}
