package Recursion_Basics.Practices;

public class Q2NumberToString {
    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void convertToString(int number) {
        if (number == 0) {
            return;
        }

        int lastNum = number % 10; // remainder will be the last digits
        convertToString(number / 10); // last digit will be removed and then passed to function
        System.out.print(digits[lastNum] + " ");
    }

    public static void main(String[] args) {
        convertToString(984586767);
    }
}
