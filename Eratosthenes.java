/* Exercise 7.6
   The Sieve of Eratosthenes is an algorithm that finds all
   prime numbers up to a given limit, n. It works by creating an array of Booleans,
   flag, of size n+1, initializing the array to true (assuming every number is a
   prime number in the beginning), and iteratively traversing the numbers from 2
   to n, setting the values of indices that are multiples of other numbers to false.
   The program uses the algorithm above, and display all the prime numbers up to n. 
*/
import java.util.*;

public class Eratosthenes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Display prime numbers up to which number?");
        int n = input.nextInt();
        input.close();

        boolean[] flag = new boolean[n + 1]; //array of boolean
        Arrays.fill(flag, true); //initialise all values in array as true (is prime)

        flag[0] = false; //0 is not a prime number
        flag[1] = false; //1 is not a prime number
        
        for (int p = 2; (p * p) <= n; p++) {
            if (flag[p]) {
                for (int i = (p * p); i <= n; i += p) {
                    flag[i] = false; //mark multiples of p as false (is not prime)
                }
            }
        }

        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (flag[i]) {
                System.out.println(i);
            }
        }
    }
}