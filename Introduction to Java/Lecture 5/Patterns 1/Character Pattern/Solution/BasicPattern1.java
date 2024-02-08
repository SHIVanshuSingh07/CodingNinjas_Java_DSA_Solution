import java.util.Scanner;
public class BasicPattern1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rows = 1;
		while(rows<=n) {
			int cols = 1;
			while(cols<=n) {
				char colChar = (char)('A'+cols-1);
				System.out.print(colChar);
				cols++;
			}
			System.out.println();
			rows++;
		}
		s.close();

	}

}
