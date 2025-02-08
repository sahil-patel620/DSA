package Arrays.Lectures;

public class KadaneAlgorithm {
    // Kadane's Algorithm to find out maximum sum of contiguous subarray of array.
    // Time complexity is O(n) which is better than Prefix sum method.
    // it means it is more optimized than Prefix sum method.


    //this will not work when all element is array is negative
    public static void maxSumSubArray(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Maximum Subarray sum is = " + maxSum);
    }


    // it will work in all cases(all negative elements & mixed elements )
    public static void kadaneforAllNegative(int arr[]) { 
        int currSum = arr[0]; 
        int maxSum = arr[0]; 
        for (int i = 1; i < arr.length; i++) { 
            currSum = Math.max(arr[i], currSum + arr[i]); 
            maxSum = Math.max(maxSum, currSum); 
        }
        System.out.println("Maximum Subarray sum is = " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int arr2[] = { -2, -3, -4, -1, -2 };

        maxSumSubArray(arr);
        kadaneforAllNegative(arr2);
        kadaneforAllNegative(arr);
    }
}
