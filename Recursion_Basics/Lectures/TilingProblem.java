package Recursion_Basics.Lectures;

// tile size = 2 X 1,   floor size = 2 X n  , how many ways to put(fill) tiles on the floor.
// this program also work for tile size = 4 X 1; and floor size = 4 X n  
public class TilingProblem {
    public static int tilingWays(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // vertical choice
        int ver = tilingWays(n - 1);

        // horizontal choice
        int hor = tilingWays(n - 2);

        int totWays = ver + hor;
        return totWays;
    }

    public static void main(String[] args) {
        int n = 4;
        int res = tilingWays(n);
        System.out.println("No of ways of Tiling on floor : " + res);
    }
}
