package Array2D.Lectures;

public class SortedMatrixSearch {

    // top right corner approach of staircase search
    public static void staircaseSearch(int matrix[][], int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("Found at cell: (" + row + "," + col + ")");
                return;
            } else if (target > matrix[row][col]) {
                row++;
            } else {
                col--;
            }
        }
        System.out.println("Target not found");
    }

    //bottom left corner approach of staircase search 
    public static void staircaseSearch2(int matrix[][], int target) {
        int row = matrix.length-1;
        int col = 0;

        while (col < matrix[0].length && row >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("Found at cell: (" + row + "," + col + ")");
                return;
            } else if (target > matrix[row][col]) {
                col++;
            } else {
                row--;
            }
        }
        System.out.println("Target not found");
    }
    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        staircaseSearch(matrix, 33);
        staircaseSearch2(matrix, 30);
    }
}
