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