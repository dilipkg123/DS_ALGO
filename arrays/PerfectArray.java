package dsandalgo.com.dilip.arrays;

/*
Given an array of size N and you have to tell whether the array is perfect or not. An array is said to be perfect if it's reverse array matches the original array. If the array is perfect then print "PERFECT" else print "NOT PERFECT".

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. First line of each test case contains an integer N (size of the array)and the second line contains N elements a0,a1,......aN-1 of an array .

Output:
For each test case, print either "PERFECT" or "NOT PERFECT" in new line as your answer.

Constraints:
1<=T<=100
1<=N<=100
1<=ai<=1000

Example:
Input:
2
5
1 2 3 2 1
5
1 2 3 4 5
Output:
PERFECT
NOT PERFECT
 */
import java.util.Scanner;
public class PerfectArray {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-->0){
          int n = sc.nextInt();
          if (n>0) {
              int[] arr = new int[n];
              for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
              }
              System.out.println(findPerfect(arr));
          }else{
              System.out.println("The array size cannot he negative or 0");
          }
      }
    }

    private static String findPerfect(int[] arr){

        int halfLength = arr.length/2;
        int fullLength = arr.length;

        for (int i=0; i<= halfLength;i++){
            if (arr[i] != arr[fullLength-1-i]) return "NOT PERFECT";
        }

        return "PERFECT";
    }
}
