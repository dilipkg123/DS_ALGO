package dsandalgo.com.dilip.arrays;

/*

Given a string S , write a program to check if all the characters of the string are same or not.

Input:
The first line of input contains a single integer T which denotes the number of test cases. Then T test cases follows. First line of each test case contains a string S.

Output:
For each test case print "YES" without quotes if all the characters of the string S are same otherwise print "NO".

Constraints:
1<=T<=100
1<=length(S)<=104

Example:
Input:
2
geeks
gggg
Output:
NO
YES


 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CheckString {
 public static void main(String[] args) throws IOException {

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     int t = Integer.parseInt(br.readLine());
     for (int i=0;i<t;i++){
         String inputString = br.readLine();
         System.out.println(checkString(inputString.toCharArray()));
     }
 }

 private static String checkString(char[] inputString){
    int hl = inputString.length/2;
    int fl = inputString.length;

    for (int i=0;i<hl;i++){
        if (inputString[i] != inputString[fl-1-i])
            return "NO";
    }
    return "YES";
 }

}
