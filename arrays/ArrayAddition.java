package dsandalgo.com.dilip.arrays;

import java.util.ArrayList;
import java.util.List;



/*
public class ArrayAddition {
    public static void main(String[] args) {
//        int firstArray[] = {9,2,3,7,9,6};
//        int secondArray[] = {3,1,4,7,8,7,6,9};

        int firstArray[] = {};
        int secondArray[] = {11,2,3};

        StringBuilder s= new StringBuilder();
        int maxLength;
        int result=0;
        int firstLen=firstArray.length;
        int secondLen=secondArray.length;
        if (firstArray.length > secondArray.length)
            maxLength=firstArray.length;
        else
            maxLength=secondArray.length;

        for (int i=0;i<maxLength;i++){
              result = ((i<firstLen)?firstArray[i]:0)+((i<secondLen)?secondArray[i]:0);
              if (result>9){
                  char[] split = String.valueOf(result).toCharArray();
                  s.append(String.valueOf(split));
              }
              else {
                  s.append(String.valueOf(result));
              }
           }
        System.out.println(s.toString().toCharArray());
    }
    }

 */

public class ArrayAddition {
    public static void main(String[] args) {
        int firstArray[] = {9, 2, 3, 7, 9, 6};
        int secondArray[] = {3, 1, 4, 7, 8, 7, 6, 9};
        int maxLen = 0;
        int resultArray[] = {};

        int firstLen = firstArray.length;
        int secondLen = secondArray.length;

        if (firstLen>secondLen) maxLen=firstLen; else maxLen= secondLen;

        for (int i=0; i<maxLen;i++){
            int res = firstArray[i]+secondArray[i];
            if (res>10){

            }
        }
    }
}


