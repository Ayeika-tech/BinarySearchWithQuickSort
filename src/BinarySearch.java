/**
 * BinarySearch
 */
public class BinarySearch {

    public static int search(Comparable[] array, Comparable value)
    {
       int first;       // First array element
       int last;        // Last array element
       int middle;      // Mid point of search
       int position;    // Position of search value
       boolean found;   // Flag
 
       // Set the inital values.
       first = 0;
       last = array.length - 1;
       position = -1;
       found = false;
 
       // Search for the value.
       while (!found && first <= last)
       {
          // Calculate mid point
          middle = (first + last) / 2;
          
          // If value is found at midpoint...
          if (array[middle].compareTo(value)== 0)
          {
             found = true;
             position = middle;
          }
          // else if value is in lower half...
          else if (array[middle].compareTo(value) > 0)
             last = middle - 1;
          // else if value is in upper half....
          else
             first = middle + 1;
       }
 
       // Return the position of the item, or -1
       // if it was not found.
       return position;
    }
    
}