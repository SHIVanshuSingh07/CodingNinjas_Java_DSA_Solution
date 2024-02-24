/*
 Problem statement
Given a 2D integer array with n rows and m columns. Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time.

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
3 3
1 2 3
4 5 6
7 8 9
Sample Output 1 :
1 2 3
1 2 3
1 2 3
4 5 6
4 5 6
7 8 9



----------------------------------------------------------------------------------------------------------
 */

public class Print2DArray {
    public static void print2DArray(int input[][]) {
        int n = input.length;
        for (int i = 0; i < n; i++) {
            int repetitions = n - i; 
            for (int j = 0; j < repetitions; j++) {
                // Print the current row
                for (int k = 0; k < input[i].length; k++) {
                    System.out.print(input[i][k] + " ");
                }
                System.out.println();
            }
        }
    }
}