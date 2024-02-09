
import java.util.Scanner;
public class SumofNNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int sum= 0;
		while(i<=n) {
			System.out.println(i); 
			sum= sum +i;
			i= i+1;
		}
		System.out.println(sum);
		s.close();
		

	}

}
