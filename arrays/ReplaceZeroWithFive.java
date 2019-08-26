package dsandalgo.com.dilip.arrays;

import java.lang.System;
import java.util.Scanner;
public class ReplaceZeroWithFive {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0 ){
            int inputNumber = sc.nextInt();
            ReplaceZeroWithFive gfg = new ReplaceZeroWithFive();
            System.out.println(gfg.zeroToFive(inputNumber));
        }
    }

    private int zeroToFive(int in){
       int temp = in, lastDigit,sum=0;
       while (temp > 0 ){
         lastDigit = temp%10;
         if (lastDigit == 0) lastDigit = 5;
         sum=sum*10+lastDigit;
         temp=temp/10;
       }

       temp=sum;
       sum=0;
       while (temp>0){
           lastDigit = temp%10;
           sum=sum*10+lastDigit;
           temp=temp/10;
       }

        return sum;
    }
}
