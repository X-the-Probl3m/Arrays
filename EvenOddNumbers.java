/* Exercise 7.5
   The program that reads ten integers, and then display the number of even numbers and odd numbers. 
   Assume that the input ends with 0.
*/

import java.util.*;

public class EvenOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[100];
        int oddNumbers = 0;
        int evenNumbers = 0;
        int count = 0;

        //read integers and determine number of even and odd numbers
        System.out.println("Enter numbers (Enter 0 to stop input): ");
        for (int i = 0; i < numbers.length; i++) {
            int number = input.nextInt();
            numbers[count] = number;
            
            if (number == 0) {
                break;
            }

            if (numbers[count] % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }

            count++;
        }
        input.close();

        //display number of odd and even numbers
        System.out.println("The number of odd numbers: " + oddNumbers);
        System.out.println("The number of even numbers: " + evenNumbers);
    }
}