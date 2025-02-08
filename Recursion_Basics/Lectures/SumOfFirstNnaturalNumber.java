package Recursion_Basics.Lectures;

public class SumOfFirstNnaturalNumber {
    public static int sumOfNnum(int n){
        if(n==1){
            return 1;
        }
        int res = n + sumOfNnum(n-1);
        return res;
    }
    public static void main(String[] args) {
        int n = 10;
        int res = sumOfNnum(n);
        System.out.println(res);
    }
}
