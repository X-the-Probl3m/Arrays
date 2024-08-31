/* Exercise 7.3
   The program reads the integers between
   1 and 50 and counts the occurrences of each. Assume the input ends with 0 
*/

import java.util.*;

public class OccurrenceOfNumbers {
    Scanner input = new Scanner(System.in);

    public void readInteger(int[] arr) {
        //read integers between 1 and 50
        System.out.println("Enter integer between 1 and 50. 0 ends input");

        while (true) {
            int in = input.nextInt();
            if (in == 0) {
                break;
            } else if (in < 0) {
                System.out.println("Enter a value greater than 0");
            } else if (in > 50) {
                System.out.println("Enter a value less than or equal to 50");
            } else {
                arr[in]++;
            }
        }
    }

    public void displayOccurences(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 1) {
                System.out.println(i + " occurs " + arr[i] + " time");
            } else if (arr[i] > 1) {
                System.out.println(i + " occurs " + arr[i] + " times");
            }
        }
    }

    public static void main(String[] args) {
        OccurrenceOfNumbers occurence = new OccurrenceOfNumbers();

        int[] arr = new int[51];

        occurence.readInteger(arr);
        occurence.displayOccurences(arr);
    }
}
