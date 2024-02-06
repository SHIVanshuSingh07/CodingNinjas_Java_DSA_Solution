// Problem statement
// Given a decimal number (integer N), convert it into binary and print.

// Note: The given input number could be large, so the corresponding binary number can exceed the integer range. So you may want to take the answer as long for CPP and Java.
// Note for C++ coders: Do not use the inbuilt implementation of "pow" function. The implementation of that function is done for 'double's and it may fail when used for 'int's, 'long's, or 'long long's. Implement your own "pow" function to work for non-float data types.




import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        int decimal=sc.nextInt();
        int num;
        long place=1,sum=0;


        while(decimal!=0)
        {
            num=decimal%2;
            //sum*=10;
            sum=sum+(num*place);
            place*=10;
            decimal/=2;
        }
        System.out.println(sum);

    }
}