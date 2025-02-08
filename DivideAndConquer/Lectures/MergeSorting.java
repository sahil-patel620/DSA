package DivideAndConquer.Lectures;

public class MergeSorting {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid + 1, ei); // right part

        merge(arr, si, mid, ei);
    }

    // merge method to merge sorted parts
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1]; // temp array
        int i = si; // idx for 1st sorted part
        int j = mid + 1; // idx for 2nd sorted part
        int k = 0; // idx for temp[]

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // for leftover elements of 1st sorted part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // for leftover elements of 2nd sorted part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // to copy temp element to original arr
        for (i = si, k = 0; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        System.out.println("Unsorted array:- ");
        printArray(arr);
        int si = 0;
        int ei = arr.length - 1;
        mergeSort(arr, si, ei);
        System.out.println("Sorted array:-");
        printArray(arr);
    }
}
