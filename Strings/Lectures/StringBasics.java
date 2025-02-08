package Strings.Lectures;

import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
    //declaration of string
    char arr[] ={'a','b','c','d'};
    String str = "abcd";
    String str2 = new String("abcd@1234");
    
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
    }
    System.out.println();
    System.out.println(str);
    System.out.println(str2);
    
    // Input and Output of String
    Scanner sc = new Scanner(System.in);
    String name = sc.next();       // takes one word as input
    String name2 = sc.nextLine();  // takes  entire line as input 

    System.out.println(name);
    System.out.println(name2);
    sc.close();

    // Concatenation of string
    String fName = "Sahil";
    String lName = "Patel";
    String fullName = fName + " " + lName;   //concatenation using + operator
    System.out.println(fullName);

    //concatenation using concat() method
    String s = "Hello";
    String s2 = "World";
    String res = s.concat(" ").concat(s2);
    System.out.println(res);
}
}
