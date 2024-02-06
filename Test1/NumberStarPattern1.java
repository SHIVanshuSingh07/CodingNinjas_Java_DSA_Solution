// Problem statement
// Print the following pattern for given number of rows.

// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// Integer N (Total number of rows)
// Output Format :
// Pattern in N lines
// Sample Input :
//    5
// Sample Output :
//  5432*
//  543*1
//  54*21
//  5*321
//  *4321



import java.util.Scanner;
public class NumberStarPattern1 {
        public static void main(String []args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int i,j;
            for(i=1;i<=n;i++){
                for(j=n;j>=1;j--){
                    if(j!=i)
                        System.out.print(j);
                    else
                        System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
