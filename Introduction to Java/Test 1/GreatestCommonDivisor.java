/*
Problem statement
You are given two numbers, ‘X’ and ‘Y’. Your task is to find the greatest common divisor of the given two numbers.

The Greatest Common Divisor of any two integers is the largest number that divides both integers.

For Example:
You are given ‘X’ as 20 and ‘Y’ as 15. The greatest common divisor, which divides both 15 and 20, is 5. Hence the answer is 5.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 10
1 <= X, Y <= 10^9
Sample Input 1:
2
20 15
8 32
Sample Output 1:
5
8
Explanation:
For the first test case, the greatest common divisor which divides both 15 and 20 is 5. Hence the answer is 5.

For the second test case, the greatest common divisor which divides both 8 and 32 is 8. Hence the answer is 8.
Sample Input 2:
2
98 56
36 60
Sample Output 2:
14
12



-----------------------------------------------------------------------------------------------------------------
*/

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