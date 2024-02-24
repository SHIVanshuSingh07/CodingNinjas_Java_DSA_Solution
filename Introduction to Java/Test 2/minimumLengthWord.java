/*
Problem statement
Given a string S (that can contain multiple words), you need to find the word which has minimum length.

Note : If multiple words are of same length, then answer will be first minimum length word in the string. Words are seperated by single space only.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= Length of String S <= 10^5

Sample Input 1 :
this is test string
Sample Output 1 :
is
Sample Input 2 :
abc de ghihjk a uvw h j
Sample Output 2 :
a



-----------------------------------------------------------------------------------------------------------
 */




 public class minimumLengthWord{
    
    public static String minLengthWord(String input) {
        String[] words = input.split(" ");
        
        int minLength = Integer.MAX_VALUE;
        String minWord = "";
        for (String word : words) {
            if (word.length() < minLength) {
                minLength = word.length();
                minWord = word;
            }
        }
        
        return minWord;
    }
}