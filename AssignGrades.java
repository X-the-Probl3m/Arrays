/* Exercise 7.1
   The program prompts the user to enter the total number of students, and then
   prompts the user to enter all of the scores, and concludes by displaying the grades.
*/

import java.util.*;

class AssignGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Determine number of students and assign to array size
        System.out.println("Enter the number of students: ");
        int n = input.nextInt();
        int[] grades = new int[n];

        //read grades, find best grade
        int best = 0;
        System.out.println("Enter student grades: ");
        for (int i = 0; i < n; i++){
            grades[i] = input.nextInt();
            if (grades[i] > best) {
                best = grades[i];
            }
        }
        input.close();

        //assign grades
        for (int i = 0; i < n; i++) {
            int score = grades[i];
            char grade;
            if (score >= best - 5) {
                grade = 'A';
            } else if (score >= best - 10) {
                grade = 'B';
            } else if (score >= best - 15) {
                grade = 'C';
            } else if (score >= best - 20) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            //display grades
            System.out.println("Student " + i + " score is " + score + " and grade is " + grade);
        }
    }
}