package Bit_Manipulation.Practices;

public class Q3Add1toInteger {
    public static void main(String[] args) {
        // adding 1 to integer
        // -x = ~x + 1 (NOT of x equals one's complement + 1)
        // -~x = x + 1
        int x = 6;
        int res = -~x;
        System.out.println(res);

        int y = -4;
        int res2 = -~y;
        System.out.println(res2);

        int z = 0;
        int res3 = -~z;
        System.out.println(res3);
    }
}
