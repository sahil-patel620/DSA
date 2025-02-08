package Arrays.Lectures;

public class LargestOfArray {
    public static int largest(int num[]) {
        int max = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        return max;
    }

    public static int smallest(int num[]) {
        int min= Integer.MAX_VALUE; // -infinity
        for (int i = 0; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int num[] = { 101, 32, 21, 55, 34, 13, 67, 990, 89, 91, 15, 335 };

        int maxValue = largest(num);
        System.out.println("Largest num in array is: "+maxValue);

        int minValue = smallest(num);
        System.out.println("Smallest num in array is: "+minValue);
    }
}
