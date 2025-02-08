package Basic_Sorting_Algorithm.Lectures;

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSorting {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }


    public static void ArrayObjectPrinting(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 1, 4 };
        int arr3[] = { 5, 3, 2, 1, 4 };
        Integer arr2[] = { 5, 3, 2, 1, 4 };
        Integer arr4[] = { 5, 3, 2, 1, 4 };
        
        Arrays.sort(arr);
        printArray(arr);
        System.out.println();

        Arrays.sort(arr3, 0, 3);
        printArray(arr3);
        System.out.println();

        Arrays.sort(arr2, Collections.reverseOrder());
        ArrayObjectPrinting(arr2);
        System.out.println();

        Arrays.sort(arr4, 0, 3, Collections.reverseOrder());
        ArrayObjectPrinting(arr4);
        System.out.println();
    }
}
