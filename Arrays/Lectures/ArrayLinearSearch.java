package Arrays.Lectures;

public class ArrayLinearSearch {
    public static int linearSearch(int marks[], int key) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int stringLinearSearch(String menu[], String dish) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(dish)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int marks[] = { 1, 2, 93, 45, 65, 86, 79, 8, 9, 10 };
        String menu[] = { "Samosa", "Chole", "Bhature", "Puri", "Kachori" };

        int key = 8236;
        String dish = "Bhature";

        // for int linear search
        int index = linearSearch(marks, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println(key + " found at index: " + index);
        }

        // for string linear search
        int index2 = stringLinearSearch(menu, dish);
        if (index2 == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println(dish + " found at index: " + index2);
        }
    }
}
