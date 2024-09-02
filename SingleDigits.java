/* Exercise 7.7
   The program generates 200 random integers between
   0 and 9 and displays the count for each number
*/
import java.util.*;

public class SingleDigits {
    public static void main(String[] args) {
        Random random = new Random();

        int[] counts = new int[10]; //counts array stores the counts for numbers 0 to 9
        
        for (int i = 0; i < 200; i++) {
            int number = random.nextInt(10); //generate random number between 0 and 9
            counts[number]++; //increment count for number;
        }

        //display count for each number
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": count: " + counts[i]);
        }
    }
}