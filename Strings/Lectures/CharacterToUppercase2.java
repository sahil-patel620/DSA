package Strings.Lectures;

public class CharacterToUppercase2 {

    // function to upper case word first letter
    public static String toUppercaseFirstLetterOfWord(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    // function to uppercase whole string
    public static String toUppercaseWholeString(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi, i am sahil patel";
        String str2 = "hello WORLD";
        System.out.println(toUppercaseFirstLetterOfWord(str));
        System.out.println(toUppercaseWholeString(str2));
    }
}
