package Basic_Sorting_Algorithm.Practices;

public class Q3DescendingInsertionSorting {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding out correct position to insert
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev]; // Shifting towards right (prev index wala value current index me aa jayega)
                prev--; // it is crucial for enabling the shifting process (it decrement prev )
            }
            // Insertion
            arr[prev + 1] = curr; // (prev +1) ensures the curr is placed in the correct position after all larger
                                  // elements have been shifted to the right.
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        insertionSort(arr);
        System.out.println("Sorted in Descending order ");
        printArray(arr);
    }
}
