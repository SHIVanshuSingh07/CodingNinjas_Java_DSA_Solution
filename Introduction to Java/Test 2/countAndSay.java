/*
Problem statement
Write as you speak is a special sequence of strings that starts with string “1” and after one iteration you rewrite the sequence as whatever you speak.

Example :
The first few iterations of the sequence are :
First iteration: “1”
    As we are starting with one.

Second iteration: “11”
    We speak “1” as   “one 1” then we write it as “11”

Third iteration: “21”
    We speak “11” as “Two 1” then we write it as “21”

Fourth iteration: “1211”
    We speak “21” as “one 2, one 1”  then we write it as “1211”

Fifth iteration: “111221”
    We speak “1211” as “one 1, one 2, two 1” then we write it as “111221”

Sixth iteration: “312211”
    We speak “111221” as “three 1, two 2, one 1” then we write it as “312211”
You will be given a single positive integer N, Your task is to write the sequence after N iterations.

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 10
1 <= N <= 30

Time Limit: 1 sec
Sample Input 1 :
2
1
2
Sample Output 1:
1
11
Explanation For Sample Input 2:
First iteration: “1”
    As we are starting with one.

Second iteration: “11”
    We speak “1” as   “one 1” then we write it as “11”
Sample Input 2 :
2
3
4
Sample Output 2:
21
1211



----------------------------------------------------------------------------------------------------------------------
 */

 public class countAndSay {
     public static String writeAsYouSpeak(int n) {
         if (n <= 0) {
             return "";
         }
         
         String sequence = "1";
         for (int i = 1; i < n; i++) {
             sequence = speakAndWrite(sequence);
         }
         return sequence;
     }
 
     private static String speakAndWrite(String s) {
         StringBuilder result = new StringBuilder();
         int i = 0;
         while (i < s.length()) {
             int count = 1;
             while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                 i++;
                 count++;
             }
             result.append(count).append(s.charAt(i));
             i++;
         }
         return result.toString();
     }
 }
