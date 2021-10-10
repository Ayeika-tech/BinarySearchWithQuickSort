/**
 * QuickSort
 */
public class QuickSort {
    public static void quickSort(Comparable[] array) {
        doQuickSort(array, 0, array.length - 1);
    }
    

    private static void doQuickSort(Comparable[] array, int start, int end) {
        int pivotPoint;

        if (start < end) {
            // Get the pivot point.
            pivotPoint = partition(array, start, end);

            // Sort the first sub list.
            doQuickSort(array, start, pivotPoint - 1);

            // Sort the second sub list.
            doQuickSort(array, pivotPoint + 1, end);
        }
    }
// partition splits the list in 2 sublists

    private static int partition(Comparable[] array, int start, int end) {
        Comparable pivotValue; // To hold the pivot value
        int endOfLeftList; // Last element in the left sub list.
        int mid; // To hold the mid-point subscript

        // Find the subscript of the middle element.
        // This will be our pivot value.
        mid = (start + end) / 2;

        // Swap the middle element with the first element.
        // This moves the pivot value to the start of
        // the list.
        swap(array, start, mid);

        // Save the pivot value for comparisons.
        pivotValue = array[start];

        // For now, the end of the left sub list is
        // the first element.
        endOfLeftList = start;

        // Scan the entire list and move any values that
        // are less than the pivot value to the left
        // sub list.
        for (int scan = start + 1; scan <= end; scan++) {
            if (array[scan].compareTo(pivotValue) < 0) {
                endOfLeftList++;
                swap(array, endOfLeftList, scan);
            }
        }

        // Move the pivot value to end of the
        // left sub list.
        swap(array, start, endOfLeftList);

        // Return the subscript of the pivot value.
        return endOfLeftList;
    }

    private static void swap(Comparable[] array, int a, int b) {
        Comparable temp;

        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
