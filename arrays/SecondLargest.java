package dsandalgo.com.dilip.arrays;
/*
Given an array A of size N, print second largest element from an array.

Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow. Each testcase contains two lines of input. The first line contains an integer N denoting the size of the array. The second line contains the N space seperated intgers of the array

Output:
For each testcase, in a new line, print the second largest element.

Constraints:
1 ≤ T ≤ 50
1 ≤ N ≤ 500
1 ≤ Ai ≤ 1200

Example:
Input
2
5
89 24 75 11 23
6
56 42 21 23 65 20
Output
75
56

 */

import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int k = 0; k < n; k++) {
                arr[k] = sc.nextInt();
            }
            System.out.println("Second Largest Number is "+secondLargest(arr));
        }
    }

    public static int secondLargest(int[] arr) {
        int max1 = arr[0];
        int max2 = -1;
        int max3 = -1;
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max1) {
                System.out.println("1st if "+arr[i]+" max1 is "+max1+" max2 is "+max2);
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2) {
                System.out.println("2nd if "+arr[i]+" max1 is "+max1+" max2 is "+max2);
                max3= max2;
                max2 = arr[i];
            }
            else if(arr[i] > max3){
               max3 = arr[i];
            }
        }
        System.out.println(max3);
        return max3;
    }

    /*
        public static void secondLargest(int[] arr){
        int secondLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i : arr){
            if(i > largest){
                secondLargest = largest;
                largest = i;
            }

            if(secondLargest < i && i < largest)
                secondLargest = i;
        }
        System.out.println(secondLargest);
	}
     */

/*    private static int secondLargest(int[] arr) {
        int fl = arr.length;
       for (int i=0;i<fl;i++){
         for (int j=i+1;j<fl;j++){
             if (arr[i] < arr[j]){
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
             }
         }
     }

     for (int z:arr)
         System.out.println(z);

        return arr[fl-2];
    }*/

/*    private static int secondLargest(int[] arr){
        int fl = arr.length;
        Arrays.sort(arr);
        return arr[arr.length-2];
    }*/

}
