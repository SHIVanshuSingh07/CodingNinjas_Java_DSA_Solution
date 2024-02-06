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
