package dsandalgo.com.dilip.arrays;

/*

A and B are good friend and programmers. They are always in a healthy competition with each other. They decide to judge the best among them by competing. They do so by comparing their three skills as per their values. Please help them doing so as they are busy.

Set for A are like [a1, a2, a3]
Set for B are like [b1, b2, b3]

Compare ith skill of A with ith skill of B
if a[i] > b[i] , A's score increases by 1
if a[i] < b[i] , B's score increases by 1

Input :
The first line of input contains an integer T denoting the test cases. For each test case there will be two lines. The first line contains the skills of A and the second line contains the skills of B

Output :
For each test case in a new line print the score of A and B separated by space.

Constraints :
1 ≤ T ≤ 50
1 ≤ a[i] ≤ 1017
1 ≤ b[i] ≤ 1017

Example:
Input :
2
4 2 7
5 6 3
4 2 7
5 2 8

Output :
1 2
0 2
*/

import java.util.Scanner;
public class CompareSkills {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = 3;
            int[] arrA = new int[n];
            int[] arrB = new int[n];
            for (int j = 0; j < n; j++)
                arrA[j] = sc.nextInt();
            for (int j = 0; j < n; j++)
                arrB[j] = sc.nextInt();
            CompareSkills gfg = new CompareSkills();
            int[] r1 = gfg.findWinner(arrA, arrB);
             System.out.println(r1[0]+" "+r1[1]);
        }
    }

     private int[] findWinner(int[] arrA,int[] arrB) {
        int n = arrA.length;
        int[] res = new int[2];
        int a=0,b=0;
        for (int i=0;i<n;i++) {
            if (arrA[i] > arrB[i]) a++;
            else if (arrA[i]<arrB[i]) b++;
        }
        res[0] = a;res[1]=b;
         return res;
        }

}
