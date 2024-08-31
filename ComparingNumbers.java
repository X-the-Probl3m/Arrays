/*  Exercise 7.2
    The program reads 11 integers, compares each
    integer with the 11th integer, and displays whether the integers are “greater”,
    “smaller”, or “equal” to the 11th integer.
 */

import java.util.*;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] integers = new int[11];
        //read integers
        System.out.println("Enter integers to compare: ");
        for (int i = 0; i < integers.length; i++) {
            integers[i] = input.nextInt(); 
        }
        input.close();

        //compare to 11th integer, display whether >, <, or =
        int reference = integers[10];
        for (int i = 0; i < integers.length -1; i++) {
           if (integers[i] > reference) {
            System.out.println(integers[i] + " > " + reference);
           } else if (integers[i] < reference) {
            System.out.println(integers[i] + " < " + reference);
           } else {
            System.out.println(integers[i] + " = " + reference );
           }
           System.out.println();
        }
    }
}
