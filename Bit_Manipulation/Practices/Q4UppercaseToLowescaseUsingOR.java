package Bit_Manipulation.Practices;

public class Q4UppercaseToLowescaseUsingOR {
    public static void main(String[] args) {
        // converts all Upeercase character to lowercase
        // ASCII code is being manipulated 
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' ') + " ");
        }
    }
}
