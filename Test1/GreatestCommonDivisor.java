// Problem statement
// Ninja was playing with her sister to solve a puzzle pattern. However, even after taking several hours, they could not solve the problem.

// A value of N is given to them, and they are asked to solve the problem. Since they are stuck for a while, they ask you to solve the problem. Can you help solve this problem?

// Example : Pattern for N = 4

// ****
//  ***     
//   **
//    *



import java.util.Scanner;
public class GreatestCommonDivisor {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int t = scanner.nextInt();
            while (t != 0) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                while (y != 0) {
                    int temp = x;
                    x = y;
                    y = temp % y;
                }

                System.out.println(x);
                t--;
            }

            scanner.close();
        }
    }

