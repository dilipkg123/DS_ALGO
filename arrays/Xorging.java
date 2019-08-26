package dsandalgo.com.dilip.arrays;

import java.util.HashSet;
import java.util.Scanner;

public class Xorging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements of the array");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(findMissing(arr));

    }

    //Xoring

    private static int findMissing(int[] arr){

       int x = 0,fl = arr.length;
        for (int i = 1; i<fl ;i++) {
            x = x ^ arr[i];
        }
        System.out.println("sx is "+(2^1^3^5^6));
        for (int i=2;i<=fl+1;i++){
            x = x^i;
        }
        System.out.println("sx1 is "+(3^1^2^3^4^5^6));
        return x;
    }

/*    //hashing
    private static String findMissing(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        String miss= null;

        for (int ina : arr)
            hs.add(ina);

        for (int i = 1; i < arr.length+1 ; i++)
            if (!hs.contains(i)) {
                miss = miss+" "+i;
            }

        return miss;

    }*/
}
