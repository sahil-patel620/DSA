package Bit_Manipulation.Lectures;

import java.util.Scanner;

public class EvenOddUsingBitwise {
    public static void EvenOdd(int num){
        int bitMask = 1;
        if((num & bitMask) == 0){
            System.out.println(num+" is Even");
        }else{
            System.out.println(num+" is Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num = sc.nextInt();
        EvenOdd(num);
        sc.close();
    }
}
