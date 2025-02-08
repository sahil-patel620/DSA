package Arrays.Practices;

import java.util.HashSet;

// Q. Given an integer array nums, return true if any value appears at least twicein the array,
//    and return false if every element is distinct.

// 1.brute force approach - time complexity O(n^2)
public class Q1Arrays {
    public static boolean ArrayElementCounter(int arr[]){

        for(int i = 0 ; i<arr.length; i++){
            for(int j=i+1; j<arr.length ; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }


    // 2. Hashset approach - time complexity O(n)
    public static boolean duplicateCounter(int arr[]){

        // Hashset is acollection thta does not allow duplicate values. 
        HashSet<Integer> set = new HashSet<>();
        for(int i= 0;i<arr.length; i++){
            if(set.contains(arr[i])){          // checks hashset , number already present or not
                return true;
            }else{
                set.add(arr[i]);               // when number is not in hashset set then add it to hashset.
            }
        }
        return false;
    }

    public static void main(String arrgs[]){
        int arr[] = {1,2,3,4,5,6,4};
        int arr2[] = {1,2,3,4,5,6};
        System.out.println(ArrayElementCounter(arr));
        System.out.println(duplicateCounter(arr2));
    }
}
