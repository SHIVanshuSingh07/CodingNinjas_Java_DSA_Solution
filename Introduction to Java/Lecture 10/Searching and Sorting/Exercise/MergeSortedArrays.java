/*
 Problem statement
You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively, merge them into a third array/list such that the third array is also sorted.

Note:
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
0 <= M <= 10^5
Time Limit: 1 sec 
Note:
Consider the case when size of the two arrays is not same.
Sample Input 1 :
1
5
1 3 4 7 11
4
2 4 6 13
Sample Output 1 :
1 2 3 4 4 6 7 11 13 
Sample Input 2 :
2
3
10 100 500
7
4 7 9 25 30 300 450
4
7 45 89 90
0
Sample Output 2 :
4 7 9 10 25 30 100 300 450 500
7 45 89 90



----------------------------------------------------------------------------------------------------------------
 */

public class MergeSortedArrays {
    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        
        int m = arr1.length;
        int n = arr2.length;
        
        int arr[] = new int[m+n];
        int i  = 0;
        int j  = 0;
        int k = 0;
        while(i<m && j<n)
        {
            if(arr1[i]<=arr2[j])
            {
                arr[k] = arr1[i];
                k++;
                i++;
            }
            else
            {
                arr[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<m)
        {
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n)
        {
            arr[k]=arr2[j];
            j++;
            k++;
        }
        return arr;
    }
    
    public static void main(String args[])
    {
        int arr1[]= {1,2,3,4,5,6,7,8};
        int arr2[] = {2,3,6,8,9};
        merge(arr1,arr2);
    }

}
