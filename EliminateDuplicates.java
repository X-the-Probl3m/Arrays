/* Exercise 7.15
   (Eliminate duplicates) method returns a new array by eliminating the
   duplicate values in the array using the following method header:
    - public static int[] eliminateDuplicates(int[] list)
   The test program reads in 10 integers, invokes the method, and displays
   the distinct numbers separated by exactly one space
*/
import java.util.*;

public class EliminateDuplicates {
    //method returns new array by eliminating duplicate values
    public static int[] eliminateDuplicates(int[] list) {
        int[] tempList = new int[list.length];
        int newSize = 0;

        //loop through original list
        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;

            //check if current element already exists in templist
            for (int j = 0; j < newSize; j++) {
                if (list[i] == tempList[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            //if element is not duplicate, add to tempList
            if (!isDuplicate) {
                tempList[newSize] = list[i];
                newSize++;
            }
        }

        //create final array with no duplicate elements
        int[] newList = Arrays.copyOf(tempList, newSize);

        return newList;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = new int[10];

        //prompt user to enter 10 integers
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            list[i] = input.nextInt();
        }
        input.close();

        //invoke eliminateDuplicates method
        int[] newList = eliminateDuplicates(list);

        //display distinct numbers
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < newList.length; i++) {
            System.out.print(newList[i] + " ");
        }
    }
}
