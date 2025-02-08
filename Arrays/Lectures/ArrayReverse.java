package Arrays.Lectures;

public class ArrayReverse {
    public static void reverse(int num[]){
        for(int i=0; i<num.length/2;i++){
            int temp = num[i];
            num[i] = num[(num.length-1)-i];
            num[(num.length-1)-i] = temp;
        }
    }

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int num[] ={1,2,3,4,5,6,7,8};
        reverse(num);
        printArray(num);
    }
}
