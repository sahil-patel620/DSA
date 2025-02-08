package Arrays.Lectures;

// Q. Given n non-negative integers representing an elevation map where the 
//    width of each bar is 1, compute how much water it can trap after raining.

public class TrappedRainwater {
    public static int trappedWater(int height[], int width) {
        int n = height.length;
      
        // left Max boundary  - array
        int leftMax[] = new int[n];     // creating Auxiliary(helper) array
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // right Max boundary  - array
        int rightMax[] = new int[n];       // creating Auxiliary(helper) array
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // loop to calculate total trapped water
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            //waterLevel = min(leftmax boundaary, rightmax boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = waterlevel - height[i]
            trappedWater += (waterLevel - height[i]) * width;
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };               //time complexity O(n)
        int width = 1;
        System.out.println("Total Trapped Water = " + trappedWater(height, width));
    }
}
