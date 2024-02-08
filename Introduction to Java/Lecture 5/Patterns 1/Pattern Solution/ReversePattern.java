import java.util.Scanner;
public class ReversePattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rows = 1;
		while(rows<=n) {
			int cols = 1;
			int itemToPrint = n;
			while(cols<=n) {
				System.out.print(itemToPrint);
				itemToPrint--;
				cols++;
			}
			System.out.println();
			rows++;
			
		}
		s.close();

	}

}
