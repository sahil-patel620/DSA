package Basic_Sorting_Algorithm.Lectures;

// Time complexity - O(n^2)
public class BubbleSorting {
    public static void BubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) { // comparing adjacent element of array
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 1, 2 };
        System.out.println("Unsorted Array : ");
        printArr(arr);

        BubbleSort(arr);
        System.out.println("Sorted in ascending order: ");
        printArr(arr);
    }
}
