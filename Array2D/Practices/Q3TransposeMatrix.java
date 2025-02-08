package Array2D.Practices;

public class Q3TransposeMatrix {
    
    public static int[][] transpose(int matrix[][]){
        int row = matrix.length;
        int col = matrix[0].length;

        int transposeMatrix[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transposeMatrix[j][i]= matrix[i][j];
            }
        }
        return transposeMatrix;
    }

    public static void printMatrix(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("{");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.print("}");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] ={{2,3,7,11},
                         {9,6,12,14},
                         {1,5,76,89}};
                         
        int transposeMatrix [][] = transpose(matrix);
        printMatrix(transposeMatrix);
    }
}
