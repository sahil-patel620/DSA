package Arrays.Lectures;

public class PassByRefrenceAndPassByValue {

    //Pass by reference of array causes change in value of original array after update.
    //Pass by value of nonChangable do not change original ones.
    public static void update(int marks[], int nonChangable) {
        // updating nonChangable
        nonChangable = 100;
        // loop to update value of array
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 10;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 84, 82, 79 };
        int nonChangable = 5;

        update(marks, nonChangable);
        System.out.println(nonChangable);

        // loop for printing all values from array
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
