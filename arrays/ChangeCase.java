package dsandalgo.com.dilip.arrays;
/*
Given a string S, the task is to change the string according to the condition; If the first letter in a string is capital letter then change the full string to capital letters, else change the full string to small letters.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains a string S.

Output:
For each test case, print the changed string in a new line.

Constraints:
1<=T<=200
1<=|string length|<=104

Example:
Input:
2
geEkS
FoR
Output:
geeks
FOR
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ChangeCase {

public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());
/*    for (int i=0;i<t;i++){
        String inputString = br.readLine();
//        if (inputString.matches("..[a-z].*$")) -- to check for third chracter.
        if (inputString.matches("..[a-z].*$"))
            System.out.println(inputString.toLowerCase());
        else
            System.out.println(inputString.toUpperCase());

    }*/

    // non language specific way:
    for (int i=0;i<t;i++){
        String inputString = br.readLine();
        if (inputString.charAt(0) >= 'A' && inputString.charAt(0) <= 'Z'){
            System.out.println(inputString.charAt(0));
            System.out.println(inputString.toUpperCase());
        }
        else System.out.println(inputString.toLowerCase());
    }


}
}
