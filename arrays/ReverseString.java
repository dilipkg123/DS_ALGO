package dsandalgo.com.dilip.arrays;

public class ReverseString {

    public static void main(String[] args) {
        String inputString = "dilips";
        char[] s = inputString.toCharArray();
        int n = s.length;
        if (s.length > 1){
            int  halfLength = s.length/2;
            for (int i=0; i< halfLength; i++){
                char temp = s[i];
                s[i]=s[n-1-i];
                System.out.println(s);
                s[n-1-i]=temp;
                System.out.println(s);
            }
            System.out.println(s);
        }
        else{
            System.out.println(s);
        }
    }
}
