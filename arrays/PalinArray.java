package dsandalgo.com.dilip.arrays;

import java.util.Scanner;

public class PalinArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int numberOFPalArr = sc.nextInt();
            int arr[] = new int[numberOFPalArr];
            for (int i = 0; i < numberOFPalArr; i++)
                arr[i] = sc.nextInt();
            System.out.println("output is " + checkPali(arr, numberOFPalArr));
        }
    }

    private static int checkPali(int[] arr, int n) {
        while (--n >= 0) {
            int arrElement = arr[n];
            if (!palin(arrElement)) {
                return 0;
            }
        }
        return 1;
    }

    private static boolean palin(int in){
        int out = in;
        int single, rev=0;
        while (out > 0){
            single = out%10;
            rev = rev*10+single;
            out=out/10;
        }

        return rev == in;
    }
}
