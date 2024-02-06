// Problem statement
// Given a binary number as an integer N, convert it into decimal and print.



import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long binary = scanner.nextLong();
        int decimal = 0;
        int power = 0;
        while (binary != 0) {
            int digit = (int) (binary % 10);
            decimal += digit * Math.pow(2, power);
            power++;
            binary /= 10;
        }
        System.out.println(decimal);
        scanner.close();

    }
}