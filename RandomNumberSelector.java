/* Exercise 7.13
   The (Random number selector) method returns a random number from a
   list of numbers passed in the argument.
*/
import java.util.*;

public class RandomNumberSelector {
    //method that returns a random number from a list of numbers passed in argument
    public static int getRandom(int[] numbers) {
        Random random = new Random();

        //random index within range of the array length
        int randomIndex = random.nextInt(numbers.length);

        //return number at random index
        return numbers[randomIndex];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("how many numbers in list?");
        int maxElement = input.nextInt();
        int[] numbers = new int[maxElement];

        if (maxElement <= 0) {
            System.out.println("The number of elements must be greater than 0.");
        }

        //prompt user to enter numbers in list
        System.out.println("Enter numbers to list");
        for (int i = 0; i < maxElement; i++) {
            numbers[i] = input.nextInt();
        }
        input.close();

        //call getRandom method
        int randomNumber = getRandom(numbers);

        //display
        System.out.println("Random number: " + randomNumber);
    }
}
