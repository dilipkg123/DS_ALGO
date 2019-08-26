package dsandalgo.com.dilip.arrays;


/*
The first line consists of an integer T i.e number of test cases. The first and only line of each test case consists of a string s.

Output:
Print the required output.

Constraints:
1<=T<=100
1<=|Length of string|<=1000

Example:
Input:
2
welcome to geeksforgeeks
what is your name ?

Output:
wlcm t gksfrgks
wht s yr nm ?
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RemoveVowels {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0){
          String inputString = br.readLine();
//          System.out.println(inputString.replaceAll("[AEIOUaeiou]",""));
            System.out.println(removeVowel(inputString));
          t--;
        }
    }

    private static String removeVowel(String inputString){

        char[] ic = inputString.toCharArray();
        for(int i=0;i<ic.length;i++){
            if (ic[i] == 'a' || ic[i] == 'e' || ic[i]=='i' || ic[i] =='o'|| ic[i]=='u'){
                ic[i] = '\0';
            }
        }
        return String.valueOf(ic);

    }
}
