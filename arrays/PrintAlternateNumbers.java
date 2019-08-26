package dsandalgo.com.dilip.arrays;

import java.util.Scanner;

public class PrintAlternateNumbers {

    public static void main(String args[]){

     Scanner sc = new Scanner(System.in);

     int t = sc.nextInt();
     while (t-- >0){
         int n = sc.nextInt();
         int arr[] = new int[n];
         for (int i=0;i<n;i++){
             arr[i] = sc.nextInt();
         }
         PrintAlternateNumbers alt = new PrintAlternateNumbers();
         alt.print(arr);
     }
    }

    private void print(int[] ia){
         for (int i=0;i<ia.length;i++){
            if(i%2 ==0){
                System.out.println(ia[i]);
            }
        }
    }
}
