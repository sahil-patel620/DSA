package Strings.Practices;

import java.util.Scanner;

public class Q1VowelOccurence {
    public static int lowercaseVowelOccurence(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        int res = lowercaseVowelOccurence(str);
        System.out.println("Lowercase vowel occured " + res + " in the String");
        sc.close();
    }
}
