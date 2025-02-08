package Recursion_Basics.Practices;

public class Q3StringLength {
    public static int lengthOfString(String str) {
        // Base case: if the string is empty, return 0
        if (str.equals("")) {
            return 0;
        }
        // Recursive case: reduce the string by 1 character and add 1 to the length
        return lengthOfString(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        int strLength = lengthOfString(str);
        System.out.println(strLength);
    }
}
