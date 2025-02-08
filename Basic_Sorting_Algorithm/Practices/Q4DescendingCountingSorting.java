package Basic_Sorting_Algorithm.Practices;

public class Q4DescendingCountingSorting {
    public static void CountingSort(int arr[]) {
        // Find the largest element(range) in the array
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Create a counting array to store the count of each element
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Sort the array using the counting array
        int j = 0;
        for (int i = count.length-1; i >= 0; i--) {
            // place the element in the sorted array
            while (count[i] > 0) {
                arr[j] = i; // This line assigns the value 'i' to the 'j'-th position in 'arr'
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        CountingSort(arr);
        System.out.println("Sorted in Descending order ");
        printArray(arr);
    }
}
