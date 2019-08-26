package dsandalgo.com.dilip.arrays;

/*
In an array find the smaller and largest where the difference is large.
eg: i/p: 2 4 11 5 8 1 9
    o/p: 2 11
    i/p: 1 12 11 2 10 8 9
    o/p: 1 12
 */

import java.util.Scanner;


public class FindLargestDifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] arr = new int[sc.nextInt()];
            for (int i = 0; i < arr.length; i++)
                arr[i] = sc.nextInt();
            System.out.println(findMaxDiff(arr));
        }
    }

    private static Integer findMaxDiff(int[] arr) {

        int maxDiff = arr[1] - arr[0];
        int minElement = arr[0];
        int small = 0, large = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] - minElement) > maxDiff) {
                maxDiff = arr[i] - minElement;
                small = minElement;
                large = arr[i];
            }
            if (arr[i] < minElement)
                minElement = arr[i];
        }

        return maxDiff;

    }
}

// 7, 9, 5, 6, 3, 2
// 2 3 10 6 4 8 1