package Arrays.Lectures;

// Prefix Method to find out maximum sum of contiguous subarray of array.
// Time complexity is O(n^2) ,better than Brute Force method.
// it means it is more optimized than brute method.
public class PrefixSumOfArray {
    public static void maxSumArray(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        // Calculating Prefix Array
        for (int i = 1; i < prefix.length; i++) {
            // formula to find next index value and putting them on ith position ;
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                //
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
            }

            if (maxSum < currSum) {
                maxSum = currSum;
            }
        }
        System.out.println("Maximum Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        maxSumArray(arr);
    }
}
