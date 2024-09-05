/* Exercise 7.17
   The program prompts the user to enter the number of students, the students’ names, and their scores and prints student names in decreasing
   order of their scores.
*/
import java.util.*;

public class SortStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt user to enter number of students
        System.out.println("Enter the number of students:");
        int numberOfStudents = input.nextInt();

        //prompt user to enter students names and scores
        String[] studentNames = new String[numberOfStudents];
        int[] studentScores = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            if (i == 0) {
                System.out.println("Enter 1st student name: ");
            } else if (i == 1) {
                System.out.println("Enter 2nd student name: ");
            } else if (i == 2) {
                System.out.println("Enter 3rd student name: ");
            } else {
                System.out.println("Enter " + (i + 1) + "th student name: ");
            }

            studentNames[i] = input.next();
            System.out.println("Enter " + studentNames[i] + "'s score: ");
            studentScores[i] = input.nextInt();
        }
        input.close();
        
        //sort students by score in descending order
        for (int i = 0; i < numberOfStudents - 1; i++) {
            for (int j = i + 1; j < numberOfStudents; j++) {
                if (studentScores[i] < studentScores[j]) {
                    //swap scores
                    int tempScore = studentScores[i];
                    studentScores[i] = studentScores[j];
                    studentScores[j] = tempScore;

                    //swap corresponding names
                    String tempName = studentNames[i];
                    studentNames[i] = studentNames[j];
                    studentNames[j] = tempName;
                }
            }
        }

        //display sorted names and scores
        System.out.println("\nStudents sorted by scores in decreasing order:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(studentNames[i] + ": " + studentScores[i]);
        }
    }
}
