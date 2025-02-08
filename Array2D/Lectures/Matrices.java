package Array2D.Lectures;

import java.util.Scanner;

public class Matrices {

    // searching in 2D array
    public static boolean searchIn2D(int matrix[][], int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Fount at Index: (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        int n = matrix.length; // to find out no. of rows
        int m = matrix[0].length; // to find out no. of columns

        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data of 2D array ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // output
        System.out.println("Displaying Array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // searching in the array
        searchIn2D(matrix, 5);
    }

}
