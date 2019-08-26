package dsandalgo.com.dilip.arrays;


/*

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each testcase contains 3 lines of input. The first line contains an integer N denoting the size of the array. Then the next line contains N space separated integers forming the array. The third line contains an element X.

Output:
For each testcase, in a new line, print the number of elements which are less than or equal to given element.

Constraints:
1 <= T <= 105
1 <= N <= 105
1 <= Ai <= 105
0 <= X <= 105

Example:
Input:
2
6
1 2 4 5 8 10
9
7
1 2 2 2 5 7 9
2
Output:
5
4
 */
import java.util.Scanner;
public class CountOfSmallerElements {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int n = sc.nextInt();
           int[] arr = new int[n];
           for (int i=0;i<n;i++){
               arr[i] = sc.nextInt();
           }
           int toFindLess = sc.nextInt();
         System.out.println("the number of smallest element is "+findSmall(arr,toFindLess));
        }
    }

    private static int findSmall(int[] inputArr,int toFindLess){

        int counter = 0;
        for (int anInputArr : inputArr) {
            if (anInputArr <= toFindLess) counter++;
        }

        return counter;
    }
}
