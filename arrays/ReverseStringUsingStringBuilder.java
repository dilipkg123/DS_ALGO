package dsandalgo.com.dilip.arrays;

public class ReverseStringUsingStringBuilder {

    public static void main(String[] args) {
        String inputString = "PILID";
        System.out.println("DILIP".split(""));

        for (String s: "DILIP".split("")){
            System.out.println(s);
        }

        StringBuilder sb = new StringBuilder();

       for (int i=inputString.length()-1;i>=0;i--){
           sb.append(inputString.toCharArray()[i]);
       }

        System.out.println(sb);

    }
}
