package Array2D.Lectures;

public class SmallestAndLargestIn2DArray {
    public static void LargestIn2D(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest number in the 2D Array is: " + largest);
    }

    public static void SmallestIn2D(int matrix[][]) {
        int Smallest = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < Smallest) {
                    Smallest = matrix[i][j];
                }
            }
        }
        System.out.println("Smallest number in the 2D Array is: " + Smallest);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { -2, 9, 8 } };
        LargestIn2D(matrix);
        SmallestIn2D(matrix);
    }
}
