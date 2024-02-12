/*
 Problem statement
You are given an integer array 'A' of size 'N', sorted in non-decreasing order. You are also given an integer 'target'.

Your task is to write a function to search for 'target' in the array 'A'. If it exists, return its index in 0-based indexing. If 'target' is not present in the array 'A', return -1.

Note:

You must write an algorithm whose time complexity is O(LogN)


Example:


Input: ‘N’ = 7 ‘target’ = 3
‘A’ = [1, 3, 7, 9, 11, 12, 45]

Output: 1

Explanation: A = [1, 3, 7, 9, 11, 12, 45],
The index of element '3' is 1.
Hence, the answer is '1'.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= 10^5
1 <= A[i] <= 10^9
1 <= target <= 10^9
Time Limit: 1 sec
Sample Input 1:
7
1 3 7 9 11 12 45
3
Sample Output 1:
1
Explanation of sample output 1:
nums = [1, 3, 7, 9, 11, 12, 45],
The index of element '3' is 1.
Hence, the answer is '1'.


Sample Input 2:
7
1 2 3 4 5 6 7
9
Sample Output 2:
-1
Explanation of sample output 2:
nums = [1, 2, 3, 4, 5, 6, 7],
Element '9' doesn't exist.
Hence, the answer is '-1'.


    public static int[] inputValue(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args){

----------------------------------------------------------------------------------------------------------------
 */

 import java.util.Scanner;

public class BinarySearch {
    public static int search(int []nums, int target) {
        // Write your code here.
        int start =0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid] > target){
                end = mid -1;
            }else if(nums[mid] < target){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return -1;

    }
    public static int[] inputValue(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
            sc.close();
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = inputValue();
        int target = sc.nextInt();
        System.out.print(search(nums, target));
        sc.close();
    }
}