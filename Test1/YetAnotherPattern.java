// Problem statement
// You are given two numbers, ‘X’ and ‘Y’. Your task is to find the greatest common divisor of the given two numbers.

// The Greatest Common Divisor of any two integers is the largest number that divides both integers.

// For Example:
// You are given ‘X’ as 20 and ‘Y’ as 15. 
// The greatest common divisor, which divides both 15 and 20, is 5. Hence the answer is 5.



import java.util.Scanner;

public class YetAnotherPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t != 0) {
            int n = scanner.nextInt();

            int i = 1;
            while (i <= n) {
                int sp = 1;
                while (sp < i) {
                    System.out.print(' ');
                    sp++;
                }

                int j = 1;
                while (j <= n - i + 1) {
                    System.out.print('*');
                    j++;
                }

                System.out.println();
                i++;
            }

            t--;
        }

        scanner.close();
    }
}
