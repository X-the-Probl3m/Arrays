/* Exercise 7.8
   (Average an array) Write two overloaded methods that return the average of an
   array with the following headers:
    -public static int average(int[] array)
    -public static double average(double[] array)
   The test program prompts the user to enter 10 double values, invokes this
   method, then displays the average value 
*/
import java.util.*;

//method to calculate average of an integer array
public class AverageAnArray {
    public static int average(int[] array) {
        int sum = 0;

        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        for (int i = 0; i < array.length; i++) {
            sum += array[i]; //add int values in array to sum
        }

        return sum / array.length;
    }

    //method to calculate average of a double array
    public static double average(double[] array) {
        double sum = 0;

        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i]; //add double values in array to sum
        }

        return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];

        //prompt user to enter 10 double values
        System.out.println("Enter 10 double values:");
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }
        input.close();

        double average = average(array); //calculate the average

        //display average 
        System.out.print("Average of [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("] is:");
        System.out.println(average);
    }
}