//Problem statement
//        Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
//
//        Note:
//        Fibonacci series is the series of numbers where each number is obtained by adding two previous numbers. The first two numbers in the Fibonacci series are 0 and 1.


public class FibonacciMember {

        public static boolean checkMember(int n){
            int a=0;
            int b=1;
            if(n==0)
            {
                return true;
            }
            while((a+b)<=n)
            {
                int temp=a+b;
                a=b;
                b=temp;
                //
                if(n==temp )
                {
                    return true;
                }
            }
            return false;
        }
    }
