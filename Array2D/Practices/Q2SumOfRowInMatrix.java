package Array2D.Practices;

public class Q2SumOfRowInMatrix {
    public static void main(String[] args) {
        int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};
        //sum of element in 2nd row of matrix
        int sum = 0;
        for (int j = 0; j < nums[0].length; j++) {
                sum+= nums[1][j];
        }
        System.out.println("Sum of 2nd row is: "+ sum);
    }
}
