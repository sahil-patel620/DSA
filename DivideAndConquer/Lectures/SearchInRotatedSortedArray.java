package DivideAndConquer.Lectures;

public class SearchInRotatedSortedArray {

    // modified binary search with recursion
    public static int search(int arr[], int tar, int si, int ei) {
        // not found
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        if (arr[mid] == tar) {
            return mid;
        }

        // mid lie on L1
        if (arr[si] <= arr[mid]) {
            // case a: left of L1 from mid
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                // case b: right of mid
                return search(arr, tar, mid + 1, ei);
            }
        }
        // mid lie on L2
        else {
            // case c: right of L2 from mid
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                // case d: left of mid
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int tarIdx = search(arr, target, 0, arr.length - 1);
        System.out.println("Index = " + tarIdx);
    }
}
