package dsandalgo.com.dilip.arrays;


/*
Remove all characters from an alphanumeric string.

Input:
The first line of the input contains T denoting the number of testcases. First line of each test case will be an alphanumeric string.

Output:
 For each test case output will be a numeric string after removing all the characters.

Constraints:
1 <= T <= 30
1 <= size of string <= 100

Example:

Input:
1
AA123BB4

Output:
1234
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RemoveChracterFromAlphaNumericString {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0){
            System.out.println("t is "+t);
          String inputStr = br.readLine();
          System.out.println(removeCharacter(inputStr));
        }
    }

/*    private static String removeCharacter(String inputStr){
        return inputStr.replaceAll("[a-dA-D]","");
    }*/

    private static String removeCharacter(String inputStr){
        char[] inc = inputStr.toCharArray();
        String res = "";
        for (int i = 0;i<inc.length;i++){
            if (!((inc[i] >= 'A' && inc[i] <='Z') || (inc[i] >='a' && inc[i]<='z'))){
                res = res+inc[i];
            }
        }
        return res;
    }

}
