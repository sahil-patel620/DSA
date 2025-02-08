package Bit_Manipulation.Lectures;

public class BitOperations {
    public static void GetIthBit(int num, int i) {
        int bitMask = 1 << i;
        if ((num & bitMask) == 0) {
            System.out.println("Bit is 0");
        } else {
            System.out.println("Bit is 1");
        }
    }

    // this function will set ith bit value to 1, which will change num value
    // accordingly
    public static int setIthBit(int num, int i) {
        int bitMask = 1 << i;
        int res = num | bitMask;
        return res;
    }

    // clearing ith bit means making ith bit 0
    public static int clearIthBit(int num, int i) {
        int bitMask = ~(1 << i);
        int res = num & bitMask;
        return res;
    }

    public static int updateIthBit(int num, int i, int newBit) {
        // // Clear ith bit
        // if (newBit == 0) {
        // clearIthBit(num, i);
        // }
        // // Set ith bit (bit == 1)
        // else {
        // setIthBit(num, i);
        // }

        // Time complexity is same as above approach.
        num = clearIthBit(num, i);
        int BitMask = newBit << i;
        int res = num | BitMask;
        return res;
    }

    public static int clearIBit(int n, int i) {
        int bitMask = (~0) << i;
        int res = n & bitMask;
        return res;
    }

    public static int clearBitsInRange(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        int res = n & bitMask;
        return res;
    }

    public static void main(String[] args) {
        GetIthBit(10, 3);
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearIBit(15, 2));
        System.out.println(clearBitsInRange(10, 2, 4));
    }
}
