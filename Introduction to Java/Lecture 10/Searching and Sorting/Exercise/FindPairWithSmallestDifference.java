import java.util.Arrays;

public class FindPairWithSmallestDifference {
    public static int smallestDifferencePair(int[] arr1, int n, int[] arr2, int m) {
        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int minDiff = Integer.MAX_VALUE;
        
        // Pointers for iterating through both arrays
        int i = 0, j = 0;
        
        // Iterate through both arrays to find the smallest absolute difference
        while (i < n && j < m) {
            int diff = Math.abs(arr1[i] - arr2[j]);
            minDiff = Math.min(minDiff, diff);
            
            // Move the pointer of the array with the smaller element
            if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        
        return minDiff;
    }

    public static void main(String[] args) {
        // Sample input
        int[][] arr1 = {{12, 7, 5}, {10, 20, 30}};
        int[][] arr2 = {{4, 4, 6}, {17, 15}};
        int[] n = {3, 3};
        int[] m = {3, 2};

        // Processing each test case
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(smallestDifferencePair(arr1[i], n[i], arr2[i], m[i]));
        }
    }
}
