package dsandalgo.com.dilip.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseAString {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String inputString = bf.readLine();

        System.out.println(reverseString(inputString));

    }

    private static char[] reverseString(String ins) {
        int fl = ins.length();
        int hl = fl / 2;
        char[] inc = ins.toCharArray();
        char temp;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < hl; i++) {
            temp = inc[i];
            inc[i] = inc[fl - 1 - i];
            inc[fl - 1 - i] = temp;
        }

/*        for (char c : inc)
            s.append(c);*/

        return inc;
    }

}