/* Exercise 7.10
   (Find the index of the largest element) Write a method that returns the index of the
   largest element in an array of integers. If there is more than one element, return
   the largest index. Use the following header:
    -public static int indexOfLargestElement(double[] array)
   The test program prompts the user to enter 10 numbers, invokes this
   method to return the index of the largest element, and displays the index and the
   element itself. 
*/
import java.util.*;

public class IndexOfLargestElement {
    public static int indexOfLargestElement(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        //determine index of largest element
        int largestIndex = 0;
        int largestElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largestElement) { //compare current element in array with previous element
                largestElement = array[i]; //assign current element to largestElement
                largestIndex = i; //assign index of largest element to largestIndex
            }
        }

        return largestIndex;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];

        //prompt users to enter 10 numbers
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        input.close();

        //find index of largest element
        int largestIndex = indexOfLargestElement(array);

        System.out.println("Index of largest number is: " + largestIndex);
        System.out.println("Largest element: " + array[largestIndex]);
    }
}
