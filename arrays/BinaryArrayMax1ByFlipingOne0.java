package dsandalgo.com.dilip.arrays;

/*
Given a binary array, find the index of 0 to be flipped to get maximum number of consecutive 1s.
Only a single 0 flip is allowed.
i/p: 011101010101
o/p: 4
 */

import java.util.Scanner;

public class BinaryArrayMax1ByFlipingOne0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        System.out.println(findMax1Index(arr));
    }

    private static int findMax1Index(int[] arr){

        int s=0,e=0,zeroCount=0;
        while(e<arr.length){
            if (zeroCount <= 1){
                e++;

            }
        }




        return 1;
    }
}
