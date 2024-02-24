/*
 Problem statement
Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function so as to change the sentence such that each word in the sentence is reversed. A word is a combination of characters without any spaces.

Example:
Input Sentence: "Hello I am Aadil"
The expected output will look, "olleH I ma lidaA".
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

All the words in string are separated by a single space.

String does not contain any leading or trailing spaces.

Time Limit: 1 second
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
emocleW ot gnidoC sajniN
Sample Input 2:
Always indent your code
Sample Output 2:
syawlA tnedni ruoy edoc


---------------------------------------------------------------------------------------------------------
 */

import java.util.Scanner;

public class reverseEachWords {
    public static String reverseWord(String str) {
        int n = str.length();
        String ans = "";
        for (int i = n - 1; i >= 0; i--) {
            ans += str.charAt(i);
        }
        return ans;
    }

    public static String reverseEachWord(String str) {
        int n = str.length();
        String ans = "";
        String word = "";
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                ans += reverseWord(word) + " ";
                word = "";
                continue;
            }
            word += str.charAt(i);
        }
        ans += reverseWord(word);
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(reverseEachWord(str));
    }
}