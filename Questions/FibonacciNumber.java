//Problem statement
//        The n-th term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
//
//        F(n) = F(n - 1) + F(n - 2),
//        Where, F(1) = 1, F(2) = 1
//
//
//        Provided 'n' you have to find out the n-th Fibonacci Number. Handle edges cases like when 'n' = 1 or 'n' = 2 by using conditionals like if else and return what's expected.
//
//        "Indexing is start from 1"
//
//
//        Example :
//        Input: 6
//
//        Output: 8



import java.util.Scanner;
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int Fn;
        if (n == 1 || n == 2) {
            Fn = 1;
        } else {
            int f1 = 1, f2 = 1;
            for (int i = 3; i <= n; i++) {
                int temp = f1 + f2;
                f1 = f2;
                f2 = temp;
            }

            Fn = f2;
        }
        System.out.println( Fn);
    }
}