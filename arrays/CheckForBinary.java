package dsandalgo.com.dilip.arrays;

import java.util.Scanner;
public class CheckForBinary {

    /*
    Example:

Input:
2
101
75

Output:
1
0
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            String s = sc.next();
            CheckForBinary gfg = new CheckForBinary();
            System.out.println((gfg.checkBinary(s)) ? 1 : 0);
            t--;
        }
    }

    private boolean checkBinary(String inputStr){

        char[] s = inputStr.toCharArray();
        for (char i:s){
            if (!(i == '0' || i=='1')){
                return false;
            }
        }
        return true;
    }
}
