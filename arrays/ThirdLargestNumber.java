package dsandalgo.com.dilip.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdLargestNumber {
    /*
    Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 103
1 ≤ A[i] ≤ 103

Example(To be used for only expected output):
Input:
1
5
2 4 1 3 5

Output:
3
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println("before loop t is "+t);
        while(t>0){
            long n = sc.nextLong();
            Long arr[] = new Long[(int) n];
            for (int i=0;i<n;i++){
               arr[i] = sc.nextLong();
            }
            ThirdLargestNumber tln = new ThirdLargestNumber();
            System.out.println(tln.thirdLargest(arr));
            t--;
        }

    }

    /*private Long thirdLargest(Long a[]){
        Arrays.sort(a);
        return (a.length>=3)?a[a.length-3]:-1;
    }*/

    private long thirdLargest(Long a[])
    {
        int n=a.length;
        if(n<3)
            return -1;
        for(int i=0;i<n-1;i++){
            System.out.println(" i = "+i);
            for(int j=i+1;j<n;j++ )
            {
                for (long z:a) System.out.print(z+",");
                System.out.println("");
                if(a[i]>a[j]){
                    long temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }
       return a[2];
    }
}
