package dsandalgo.com.dilip.arrays;

import java.util.Scanner;

public class RearrangeArrayAlternatively {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            arr = rearrangeArray(arr);
            for (int a : arr)
                System.out.print(a + " ");

        }
    }

    private static int[] rearrangeArray(int[] arr) {
        int rArr[] = new int[arr.length];
        int fl = arr.length, s = 0, e = fl - 1;
        for (int i = 0; i < fl; i++) {
            rArr[i] = (i % 2 == 0) ? arr[e--] : arr[s++];
        }

        return rArr;

    }
}
