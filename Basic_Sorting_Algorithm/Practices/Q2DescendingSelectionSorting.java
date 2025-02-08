package Basic_Sorting_Algorithm.Practices;

//pick the smallest and put at the beginning 
public class Q2DescendingSelectionSorting {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i; // store minimum num index
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[minPos]) {
                    minPos = j;
                }
            }
            // Swapping
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        selectionSort(arr);
        System.out.println("Sorted in Descendng order");
        printArray(arr);
    }
}
