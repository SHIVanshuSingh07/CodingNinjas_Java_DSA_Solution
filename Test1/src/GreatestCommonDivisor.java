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

