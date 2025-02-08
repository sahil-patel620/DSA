package Strings.Lectures;

public class StringCompression {
    // Time complexity - O(n^2)
    public static String compressUsingString(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }

    // Time complexity - O(n)
    public static String compressUsingStringBuilder(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {

            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbbbbbbcdd";
        String str2 = "abbbbbccdddd";
        System.out.println("Compressed String = " + compressUsingString(str));
        System.out.println("Compressed String = " + compressUsingStringBuilder(str2));
    }
}
