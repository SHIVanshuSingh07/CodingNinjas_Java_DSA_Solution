// Problem statement
// Write a program to generate the reverse of a given number N. Print the corresponding reverse number.

// Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.



import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int reversedNumber = 0;

        while (N != 0) {
            int digit = N % 10;
            reversedNumber = reversedNumber * 10 + digit;
            N /= 10;
        }
        System.out.print(reversedNumber);
    }
}
