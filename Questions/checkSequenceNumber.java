// Problem statement
// You are given S, a sequence of n integers i.e. S = s1, s2, ..., sn. Compute if it is possible to split S into two parts : s1, s2, ..., si and si+1, si+2, ….., sn (0 <= i <= n) in such a way that the first part is strictly decreasing while the second is strictly increasing one.

// Note : We say that x is strictly larger than y when x > y. So, a strictly increasing sequence can be 1 4 8. However, 1 4 4 is NOT a strictly increasing sequence.




import java.util.Scanner;
public class checkSequenceNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int prev = s.nextInt();
        boolean seq_valid = true;
        boolean seq_increasing = false;
        int i = 1;
        while(i<=n-1) {
            int curr = s.nextInt();
            int diff = curr-prev;
            if(diff == 0) {
                seq_valid = false;
                break;
            }
            else if(diff>0) {
                seq_increasing = true;
            }
            else if(diff<0) {
                if(seq_increasing == true) {
                    seq_valid = false;
                }
            }
            prev = curr;
            i++;
        }
        System.out.println(seq_valid);
        
    }
    
}