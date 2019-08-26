package dsandalgo.com.dilip.arrays;
/*
Given an array of size N, swap the kth element from beginning with kth element from end.

Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow. Each testcase contains 2 lines of input:
The first line contains an integer N, where N is the size of array.
The second line contains N integers(elements of the array) sperated with spaces.

Output:
For each test case, print the modified array.

Constraints:
1 ≤ T ≤ 200
1 ≤ K ≤ N ≤ 500
1 ≤ A[i] ≤ 1000

Example:
Input
1
8 3
1 2 3 4 5 6 7 8
Output
1 2 6 4 5 3 7 8

 */
import java.util.Arrays;
import java.util.Scanner;

public class SwapKthElement{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i<n; i++)
                arr[i] = sc.nextInt();

            arr = swapKth(arr,k);
                System.out.print(Arrays.toString(arr).trim());

        }


    }

    private static int[] swapKth(int[] arr, int k){

        int fl = arr.length;
        arr[k-1] = arr[k-1]+arr[fl-k];
        arr[fl-k] = arr[k-1]-arr[fl-k];
        arr[k-1] = arr[k-1]-arr[fl-k];

        return arr;

    }


}