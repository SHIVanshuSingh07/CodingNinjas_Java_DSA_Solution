
import java.util.Scanner;
public class CheckPrimality {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean isPrime = true;
		int div = 2; 
		while(div*div<=n) { 
			if(n%div==0) {
				isPrime = false;
				break;  
			}
			div = div+1;
		}
		if(isPrime) {
			System.out.println("Number is Prime");
		}else {
			System.out.println("Number is not Prime");
		}
      s.close();
	}

}
