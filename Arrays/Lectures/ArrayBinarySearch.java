package Arrays.Lectures;

import java.util.Scanner;

public class ArrayBinarySearch {
    public static int binarySearch(int num[], int key) {

        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (num[mid] == key) {    // found
                return mid;
            }
            if (num[mid] > key) {     // left
                end = mid - 1;
            }else{                    // right
                start = mid + 1;
            }
        }
        return -1;                  // not found
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 23, 43, 56, 54, 67 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any no to search using Binary Search: ");
        int key = sc.nextInt();
        
        int idx = binarySearch(num, key);

        if (idx == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println(key + " found at index: " + idx);
        }
        
        sc.close();
    }
}
