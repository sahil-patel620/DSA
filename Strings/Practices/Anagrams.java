package Strings.Practices;

import java.util.Arrays;

// If two strings contain the same characters but in a different order, they can be said to be anagrams.
public class Anagrams {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        //convert Strings to lowercase.
        //so that we don't have to check separately for lower & uppercase.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //First check - if there length are same 
        if(str1.length() == str2.length()){

            // convert strings into char array
            char str1charArray[] = str1.toCharArray();
            char str2charArray[] = str2.toCharArray();

            // sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            boolean res = Arrays.equals(str1charArray, str2charArray);

            if(res){
                System.out.println(str1 +" and "+ str2 +" are anagrams to each other.");
            }else{
                System.out.println(str1 +" and "+ str2 +" are not anagrams to each other.");
            }
        }else{
            System.out.println(str1 +" and "+ str2 +" are not anagrams to each other.");
        }
    }
}
