package DivideAndConquer.Practices;

public class Q1MergeSortingForString {
   
    public static void mergeSortString(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSortString(arr, si, mid); // left part
        mergeSortString(arr, mid + 1, ei); // right part
        // to  merge left and right sorted array
        mergeStringArray(arr, si, mid, ei);
    }
     // merge method to merge sorted parts
    public static void mergeStringArray(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];
        int i = si;// idx for 1st sorted part
        int j = mid + 1;// idx for 2nd sorted part
        int k = 0;// idx for temp[]

        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) <= 0) {   // means arr[i] is lexically smaller than arr[j]
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
        String[] arr = {"apple", "orange", "banana", "pear", "grape"};
        mergeSortString(arr, 0, arr.length - 1);

        System.out.println("Sorted array: ");
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
