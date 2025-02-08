package Arrays.Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Q5ThreeSum {

    // Brute force approach (not efficient) , Time complexity O(n^3).
    public static List<List<Integer>> threeSum(int nums[]) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet); // sorting triplet list
                        result.add(triplet);
                    }
                }
            }
        }
        // This converts the LinkedHashSet back to an ArrayList. As a result,
        // the result list now contains only unique triplets, with duplicates removed.
        result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
        return result;
    }

    
    //Sorting + Two pointer , time complexity O(n^2)
    public static List<List<Integer>> efficient3Sum(int[] nums) {
        // Sort the array
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            // Two-pointer approach
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Found a triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicate elements
                    while (left < right && nums[left] == nums[left + 1])
                        left++;
                    while (left < right && nums[right] == nums[right - 1])
                        right--;

                    // Move pointers
                    left++;
                    right--;
                } else if (sum < 0) {
                    // Increase the sum by moving the left pointer to the right
                    left++;
                } else {
                    // Decrease the sum by moving the right pointer to the left
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };

        List<List<Integer>> result = threeSum(nums);

        List<List<Integer>> res2 = efficient3Sum(nums);

        // to print list of lists
        for (List<Integer> list : result) {
            System.out.println(list);
        }

        for (List<Integer> list : res2) {
            System.out.println(list);
        }

    }
}
