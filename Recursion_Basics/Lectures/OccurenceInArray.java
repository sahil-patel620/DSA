package Recursion_Basics.Lectures;

public class OccurenceInArray {
    public static int firstOccurenceIndex(int arr[], int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) { // comparing
            return i;
        }
        // then looking forward
        return firstOccurenceIndex(arr, target, i + 1);
    }

    public static int lastOccurenceIndex(int arr[], int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurenceIndex(arr, target, i + 1); //looking forward then comparing
        if (isFound == -1 && arr[i] == target) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int target = 5;
        int fidx = firstOccurenceIndex(arr, 5, 0);
        int lidx = lastOccurenceIndex(arr, 5, 0);
        System.out.println("First Occurence of " + target + " is at index : " + fidx);
        System.out.println("And last Occurence is at index : " + lidx);
    }
}
