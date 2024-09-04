/* Exercise 7.11
   (Statistics: compute deviation) The Program computes the standard
   deviation of numbers.
*/
import java.util.*;

public class Deviation {
    //compute mean of an array of double values
    public static double mean(double[] x) {
        double sum = 0; //store sum of elements in array

        for (int i = 0; i < x.length; i++) {
            sum += x[i]; //add element to sum
        }

        return sum / x.length;
    }

    //compute deviaton of double values
    public static double deviation(double[] x) {
        double sum = 0;
        double average = mean(x); //call mean method

        for (int i = 0; i < x.length; i++) {
            double dataPoint = x[i] - average; //subtract mean from each data point
            double square = Math.pow(dataPoint, 2); //square value of (dataPoint - mean)
            sum += square;
        }

        double variance = sum / (x.length - 1); //calculate variance
        return Math.sqrt(variance); //return standard deviation
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] x = new double[10]; //double array to store user inputs

        //prompt user to enter 10 numbers
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            x[i] = input.nextDouble();
        }
        input.close();

        double meanValue = mean(x);
        double deviationValue = deviation(x);

        //display mean and deviation
        System.out.println("The mean is: " + String.format("%.2f", meanValue));
        System.out.println("The standard deviation is: " + String.format("%.2f", deviationValue));
    }
}