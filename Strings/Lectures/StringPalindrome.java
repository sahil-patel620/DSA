package Strings.Lectures;

public class StringPalindrome {
    // time complexity  O(n)
    public static boolean Palindrome(String str){
        int n = str.length();
        for (int i = 0; i < n/2; i++) {
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str= "racecar";
        boolean isPalindrome = Palindrome(str);

        if(isPalindrome){
            System.out.println(str+ " is a Palindrome");
        }else{
            System.out.println(str +" is not a Palindrome");
        }
    }
}
