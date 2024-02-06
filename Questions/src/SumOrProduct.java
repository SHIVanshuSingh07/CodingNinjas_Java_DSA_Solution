import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int C = scanner.nextInt();
        int result = 1;
        if (C == 1) {
            result = (N * (N + 1)) / 2;
        } else if (C == 2) {
            for (int i = 1; i <= N; i++) {
                result *= i;
            }
        } else {
            result = -1;
        }
        System.out.println(result);

    }
}
