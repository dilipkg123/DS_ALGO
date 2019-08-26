package dsandalgo.com.dilip.arrays;

/*
Given a number N. Your task is to check whether it is fascinating or not.
Fascinating Number : When a number( 3 digit or more) is multiplied by 2 and 3 ,and when both these products are concatenated with the original number, then it results in all digits from 1 to 9 present exactly once.

Input:
First line contains number of test cases T. Then following T lines contains a positive integer N.

Output:
Print "1" (without quotes) if given number is fascinating else "0" (without quotes) .

Constraints:
1 <= T <= 200
100 <= N <= 107

Example:
Input:
3
192
853

Output:
1
0
Explanation:
Testcase 1: After multiplication with 2 and 3, and concatenating with original number, number will become 192384576 which contains all digits from 1 to 9.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class FacinatingNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0){

            int inputNum = Integer.parseInt(br.readLine());
            System.out.println(checkFacinating(inputNum));
        }

    }

    public static int checkFacinating(int inputStr){
        String afterCon = String.valueOf(inputStr)+String.valueOf(inputStr*2)+String.valueOf(inputStr*3);
        System.out.println(afterCon);
        BigInteger a = new BigInteger(afterCon);
        int fl = afterCon.length();
        int[] arr = new int[fl+1];

        while (a.intValue()>0){
//            System.out.println(a);
//            System.out.println(a.mod(new BigInteger("10")));
            arr[Integer.parseInt(a.mod(new BigInteger("10")).toString())] = 1;
            a = a.divide(new BigInteger("10"));
        }


        for (int j =1;j<arr.length;j++){
//            System.out.println("j is "+j);
            if (arr[j] == 0) return 0;
        }

        return 1;

    }
}


/*
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void SetArr(int n,int arr[])
    {
        while(n>0)
        {
            arr[n%10] = 1;
            n = n/10;
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {	String result="";
            int n = sc.nextInt();
            if(n<100)
                System.out.println("Number should be atleast three digits");
            else
            {
                int arr[] = new int[10];
                for (int a:arr)
                    System.out.println("a is "+a);
                int p1 = n*2;
                int p2 = n*3;
                SetArr(n,arr);
                SetArr(p1,arr);
                SetArr(p2,arr);
                	System.out.println(Arrays.toString(arr));
                for(int i=1;i<10;i++)
                {
                    if(arr[i]==0)
                    {
                        result="Not Fascinating" ;
                        break;
                    }
                    else
                        result="Fascinating";
                }
                System.out.println(result);
            }
        }
        sc.close();
    }
}


*/
