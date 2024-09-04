/* Exercise 7.14
   (Computing lcm) method returns the lcm (least common multiple) of
   an unspecified number of integers. 
   The test program prompts the user to enter five numbers, invokes the
   method to find the lcm of these numbers, and displays the lcm.
*/
import java.util.*;

public class LCM {
    //method to compute the GCD of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //method to compute lcm of two numbers
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    //method to compute lcm of unspecified number of integers
    public static int lcm(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Enter at least one number:");
        }

        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = lcm(result, numbers[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        //prompt user to enter five numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }
        input.close();

        //invoke lcm method
        int lcm = lcm(numbers);

        //display lcm
        System.out.println("LCM is: " + lcm);
    }
}
