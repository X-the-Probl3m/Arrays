/* Exercise 7.16
   The program is designed to compare the execution time of linear search and binary search on an array of 100,000,000 integers  
   It prompts the user to choose between the linear search or binary serach algorithm. 
   It Displays the execution time of invoking the linearSearch method and the binarySearch method.
*/
import java.util.*;

public class ExecutionTime {
    //linear search 
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }

    //binary search
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -low - 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers = 100000000;
        int[] array = new int[numbers];

        //create array of numbers from 1 to 100,000,000
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        //prompt user to decide which search to perform
        System.out.println("Which search operation do you wish to perform (1. Linear Search   2. Binary Search)");
        int searchOperation = input.nextInt();

        System.out.println("Enter variable to search for: ");
        int search = input.nextInt();
        
        long startTime, endTime, executionTime;

        switch (searchOperation) {
            case 1:
                startTime = System.nanoTime();
                int linearResult = linearSearch(array, search);
                endTime = System.nanoTime();
                executionTime = endTime - startTime;
                if (linearResult == -1) {
                    System.out.println("Variable not found in linear search.");
                } else {
                    System.out.println("Variable found at index " + linearResult + " using linear search.");
                }
                System.out.println("Execution time for linear Search: " + executionTime / 1000000 + "ms");
                break;

            case 2:
                startTime = System.nanoTime();
                int binaryResult = binarySearch(array, search);
                endTime = System.nanoTime();
                executionTime = endTime - startTime;
                if (binaryResult == -1) {
                    System.out.println("Variable not found in binary search.");
                } else {
                    System.out.println("Variable found at index " + binaryResult + "using binary search.");
                }
                System.out.println("Execution time for binary Search: " + executionTime / 1000000 + "ms");
                break;

            default:
            System.out.println("Choose valid operation");
        }
        input.close();
    }
}