package Arrays.Lectures;

public class MaxSubarraySum {
    // Brute Force Method of finding out max and min from subarray of array.
    // Time complexity of this method is n^3
    public static void subArray(int arr[]){
        int ts = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                int end = j;
                for(int k = start ; k<=end; k++){
                    System.out.print(arr[k] +" ");
                    sum +=arr[k];
                }
                if(max<sum){
                    max=sum;
                }
                if(min>sum){
                    min=sum;
                }
                System.out.print("     Sum = "+ sum);
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays = "+ts);
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
   
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        subArray(arr);
    }
}
