//Problem statement
//        Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
//
//        Print the prime numbers in different lines.



import java.util.Scanner;
public class AllPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 2; i <= N; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
