/* Exercise 7.12
   The method reverses an array by copying it to a new array. The method reverses the array passed in
   the argument and returns this array. The test program prompts the user to
   enter 10 numbers, invokes the method to reverse the numbers, and displays the
   numbers. 
*/
import java.util.*;

public class ReverseArray {
    //method to reverse array
    public static int[] reverse(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length - 1 - i];
        }

        return newArray;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maxElement = 10;
        int[] array = new int[maxElement];

        //prompt user to enter 10 numbers
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < maxElement; i++) {
            array[i] = input.nextInt();
        }
        input.close();

        //call reverseArray method
        int[] reversedArray = reverse(array);

        //display original array
        System.out.println("Original array");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("] \n");

        //display reversed array
        System.out.println("Reversed array");
        System.out.print("[");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i]);
            if (i < reversedArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
