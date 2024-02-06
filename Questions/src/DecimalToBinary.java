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