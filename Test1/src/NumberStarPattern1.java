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
