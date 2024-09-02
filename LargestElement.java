/* Exercise 7.9
   (Find the largest element) Write a method that finds the largest element in an array
   of double values using the following header:
    -public static double max(double[] array)
   The test program prompts the user to enter ten numbers, invokes this
   method to return the maximum value, and displays the maximum value.
*/
import java.util.*;

public class LargestElement {
    //method that finds largest element in array of double values
    public static double max(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        double largest = array[0]; //initialise 'largest with 1st element in array'
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) { //compare array element with value 'largest'
                largest = array[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];

        //prompt user to enter 10 numbers
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        input.close();

        double largest = max(array); //implement max method

        //display the largest value
        System.out.println("The largest number is: " + largest);
    }
}
