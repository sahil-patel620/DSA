package Arrays.Lectures;

public class PairsOfArray {
    // this function will create all possible pairs of the elements in the array
    public static void pairing(int arr[]) {
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            // int current = i;
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = " + tp);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        pairing(arr);
    }
}
