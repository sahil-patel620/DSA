package Arrays.Lectures;

import java.util.*;

public class ArraysCC {
    public static void main(String[] args) {
        int marks[] = new int[100];

        System.out.println("Enter marks");
        Scanner sc = new Scanner(System.in);

        // Inserting value to array
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Phy : " + marks[0]);
        System.out.println("Chem : " + marks[1]);
        System.out.println("Math : " + marks[2]);

        // Updating Array
        marks[0] = marks[0] + 2;
        marks[1] = 92;
        System.out.println("After updating Phy : " + marks[0]);
        System.out.println("After Updating Chem : " + marks[1]);

        // percentage
        int per = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage = " + per + "%");

        // Array length
        System.out.println("Length of the Array = "+ marks.length);
        sc.close();
    }
}
