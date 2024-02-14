//write a program to check whether a input n is part of Fibonacci Series
//if yes print true else false.


// ---------------------------------------------------------------------------------------------------------


import java.util.Scanner;
public class FibonacciNumber {

	public class Solution {
		public static boolean checkMember(int n){
	        int a = 0;
	        int b = 1;
	        int c;
	        while(a<n){
	            c=a+b;
	            a=b;
	            b=c;
	        }
	        if(a==n){
	          return true;
	        }else{
	            return false;
	        }
		}
	}
	//pregiven code
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(Solution.checkMember(n));
		s.close();
	}

}
