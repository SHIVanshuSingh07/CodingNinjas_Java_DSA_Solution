import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int result = (int) Math.sqrt(N);
            System.out.println(result);
    }
}
