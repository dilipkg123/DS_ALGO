package dsandalgo.com.dilip.arrays;


/*

Given an array C[], write a program that prints 1 if array is sorted in non-decreasing order, else prints 0.

Input:
The first line of input contains an integer T denoting the number of test cases. For each test case there will be two lines. First line contains the size of the array N. Second line contains N space seperated integers of the array C[i].

Output:
Print 1 if array is sorted, else print 0.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 500
1 ≤ C[i] ≤ 1200

Example:
Input
2
5
10 20 30 40 50
6
90 80 100 70 40 30

Output
1
0
 */
import java.util.Scanner;
public class CheckIfArrayIsSorted {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
          int n = sc.nextInt();
          int[] arr = new int[n];
          for (int i = 0;i<n;i++){
              arr[i] = sc.nextInt();
          }
            System.out.println(checkSorted(arr));
        }

    }

    private static int checkSorted(int[] arr){
        int fl = arr.length;
        for (int j = 0;j<fl-1;j++){
          if (arr[j] > arr[j+1]) return 0;
        }
        return 1;
    }

/*    public static int checkSorted(int[] arr) {
        int sorted = 1;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] <= arr[i+1])
                sorted = 1;
            else {
                return  0;
            }
        }
        return sorted;
    }*/
}
