package Recursion_Basics.Practices;

public class Q4CountingSubStrings {
    public static int counter(String str, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }

        int res = counter(str, i + 1, j, n - 1) + counter(str, i, j - 1, n - 1) - counter(str, i + 1, j - 1, n - 2);

        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        int j = n - 1;
        int result = counter(str, 0, j, n);
        System.out.println(result);
    }
}
