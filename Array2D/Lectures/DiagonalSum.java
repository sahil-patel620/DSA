package Array2D.Lectures;

public class DiagonalSum {
    public static int DSum(int matrix[][]) {
        int n = matrix.length;
        // int m = matrix.length;
        int sum = 0;

        // Brute force approach with time complexity O(n^2)
        // for(int i = 0; i<n;i++){
        //      for (int j = 0; j <m; j++) {
        //              if(i==j){
        //                  sum+= matrix[i][j];
        //              }else if(i+j == n-1){
        //                  sum+= matrix[i][j];
        //              }
        //      }
        // }

        // linear approach with time complexity O(n).
        for (int i = 0; i < n; i++) {
            // Primary diagonal sum
            sum += matrix[i][i];

            if (i != n - i - 1) { // to skip addition where i==j in SD because it already added in the PD.
                // Secondary diagonal sum
                sum += matrix[i][n - i - 1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int totalSum = DSum(matrix);
        System.out.println("Total Diagonal Sum(PD + SD) = " + totalSum);
    }
}
