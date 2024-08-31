/* Exercise 7.4
   The program reads an unspecified number of scores and
   determines how many scores are above or equal to the average, and how many
   scores are below the average. The user enters a negative number to signify the end of the
   input. Assume the maximum number of scores is 100.
*/

import java.util.*;

public class AnalyseScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] scoresArr = new int[100]; //'scores' array stores int variables. Max capacity 100
        int sum = 0, aboveAverage = 0, equalAverage = 0, belowAverage = 0, count = 0;
        double average;

        //read unspecified number of scores, and determine average
        System.out.println("Enter Scores (Enter a negative number to stop): ");
        for (int i = 0; i < scoresArr.length; i++) {
            int score = input.nextInt();
            if (score < 0) {
                break;
            }
            scoresArr[count] = score;
            count++;
            sum += score;
        }
        input.close();

        //determine how many scores are above, below or equal to average
        if (count > 0) {
            average = (double)sum / count;

            for (int j = 0; j < count; j++) {
                if (scoresArr[j] > average) {
                    aboveAverage++;
                } else if (scoresArr[j] < average) {
                    belowAverage++;
                } else {
                    equalAverage++;
                }
            }

            System.out.println("Average: " + average);
            System.out.println("scores above average: " + aboveAverage);
            System.out.println("Scores below average: " + belowAverage);
            System.out.println("Scores equal to average: " + equalAverage);
        } else {
            System.out.println("No valid scores were entered");
        }
    }
}
