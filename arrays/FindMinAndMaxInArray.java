package dsandalgo.com.dilip.arrays;

import java.util.Scanner;
public class FindMinAndMaxInArray {


 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     while (t-- > 0){
         int n = sc.nextInt();
         int[] arr = new int[n];
         for (int i=0;i<n;i++){
             arr[i] = sc.nextInt();
         }

         System.out.println(findMinAndMax(arr));
     }

 }

 private static String findMinAndMax(int[] arr){

     int min = arr[0];
     int max = arr[0];
     for (int i=0;i<arr.length;i++){
         if (min > arr[i]) min = arr[i];
         if (max < arr[i]) max = arr[i];
     }
     return "Maximum element is: "+max+" Minimum element is : "+min;
 }
}

/*    public static void main(String[] args) {
        int[] inputArray = new int[]{32,23,56,48,98,56,1,2,3,5,8,9,0,-99,562};
//        int[] inputArray = new int[]{0,0,0,0,0,0,0,1,3,4,0};

        int min = inputArray[0];
        int max = inputArray[0];

        for (int i=0;i<inputArray.length;i++){
            if (max<inputArray[i]) max = inputArray[i];
            if (min>inputArray[i]) min = inputArray[i];

        }

        System.out.println("max is "+max);
        System.out.println("min is "+min);
    }*/