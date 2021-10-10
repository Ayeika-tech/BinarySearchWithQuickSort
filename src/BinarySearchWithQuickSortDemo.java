import java.util.Scanner;

/**
 * BinarySearchWithQuickSortDemo
 */
public class BinarySearchWithQuickSortDemo {

    public static void main(String[] args) {
        int result = 0;
        String input;
        Scanner keyboard = new Scanner(System.in);
        String[] myFamily = { "Elizabeth", "Orlando", "Nidia", "Celibeth", "Yomaika", "Victor", "Angela","Celia","Isabel" };

        // Display unsorted Array
        System.out.print("\n\tThis is the unsorted Array: ");
        for (String string : myFamily) {
            System.out.print(string + " ");
        }
        // Sort the Array
        QuickSort.quickSort(myFamily);
        // Display sorted Array
        System.out.print("\n\tThis is the Sorted Array: ");
        for (String string : myFamily) {
            System.out.print(string + " ");
        } // Get input from user to search
        System.out.print("\nEnter a value to search for: ");
         input = keyboard.nextLine();
        System.out.println(" ");
        // search for a specific String
        result = BinarySearch.search(myFamily, input);
        // Lastly display the results
        if (result == -1)
            System.out.println(input + " was not found.");
        else {
            System.out.println(input + " was found at " + "element " + result);
        }//close keyboard
        keyboard.close();
    }
}