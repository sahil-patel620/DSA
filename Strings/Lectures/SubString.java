package Strings.Lectures;

public class SubString {
    //own function to return substring
    public static String subStringOfString(String str, int si, int ei){
        String substr ="";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str ="HelloWorld";
        System.out.println(subStringOfString(str, 0, 5));

        String Substr = str.substring(3,6);
        System.out.println(Substr);
    }
}
