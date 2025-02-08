package Array2D.Practices;

public class Q1CounterIn2D {
    public static void count7(int matrix[][]){
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]== 7){
                    count++;
                }
            }
        }
        System.out.println("7 in matrix are: "+ count);
    }
    public static void main(String[] args) {
        int matrix [][]= { { 8, 7, 39, 7 },
                           { 9, 25, 7, 45 }};
        count7(matrix);
    }
}
