package Arrays.Practices;

public class Q2_RotatedSortedArraySearch {

    public static int search(int[] nums, int target) {

        // min will have the index of the minimum element of nums
        int min = minSearch(nums);

        // If the target is within the right sorted portion of the array
        if (nums[min] <= target && target <= nums[nums.length - 1]) {
            return search(nums, min, nums.length - 1, target);
            // If the target is within the left sorted portion of the array
        } else {
            return search(nums, 0, min, target);
        }
    }

    // binary search to find target in left and right boundary
    public static int search(int nums[], int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // to find smallest element index
    public static int minSearch(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            // This checks if the midpoint element is less than its previous element. If true, it means nums[mid] is the smallest element and the rotation point.
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return mid;
            // This checks if the left half of the array is sorted (i.e., nums[start] <= nums[mid]),
            //  and if nums[mid] is greater than nums[end]. If true, it means the minimum element is in the right half.
            } else if (nums[start] <= nums[mid] && nums[mid] > nums[end]) {
                start = mid + 1;
            // If neither of the previous conditions is true, it implies that the minimum element is in the left half of the array.
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        // Initialize a rotated sorted array
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0; // Target element to search for

        int result = search(nums, target);

        // Print the result
        System.out.println("Index of " + target + ": " + result);
    }
}
