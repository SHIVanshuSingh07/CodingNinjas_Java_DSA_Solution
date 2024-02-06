// Problem statement
// Given a number N, find its square root. You need to find and print only the integral part of square root of N.

// For eg. if number given is 18, answer is 4.



import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int result = (int) Math.sqrt(N);
            System.out.println(result);
    }
}
