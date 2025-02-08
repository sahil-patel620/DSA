package Recursion_Basics.Practices;

public class Q1AllOccurenceIndex {
    public static void allOccurence(int arr[], int idx , int target){
        if(idx == arr.length){
            return ;
        }

        if(arr[idx] == target){
            System.out.print(idx + " ");
        }

        allOccurence(arr, idx+1, target); // to check in forward direction
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int target = 2;
        allOccurence(arr, 0, target);
    }
}
