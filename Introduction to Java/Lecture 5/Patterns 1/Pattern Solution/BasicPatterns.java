import java.util.Scanner;
public class BasicPatterns {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int rows=1;
		while(rows<=number) {
			int cols = 1;
			while(cols<=number) {
			 System.out.print("*");
			 cols++;
			}
			System.out.println();
			rows++;
		}
		s.close();
		
		

	}

}
