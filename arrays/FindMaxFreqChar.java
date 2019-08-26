package dsandalgo.com.dilip.arrays;

public class FindMaxFreqChar {

    public static void main(String[] args) {
        String input = "dilllip";
        int numberOfTimes=0;
        int localNumberOfTimes=0;
        char maxChar =  '\0';
        for (int i=0;i<input.length();i++){
           char charToBeSearched = input.toCharArray()[i];
            for (int j=0;j<input.length();j++){
                if (charToBeSearched == input.toCharArray()[j]){
                    localNumberOfTimes++;
                }
            }

            if (numberOfTimes == 0 || localNumberOfTimes>numberOfTimes){
                numberOfTimes = localNumberOfTimes;
                maxChar=charToBeSearched;
            }
            localNumberOfTimes=0;
        }
        System.out.println("answer is "+maxChar);
    }





/*    public static void main(String[] args) {
        String input = "aaanndal";
        char maxChar='\0';
        char[] charArr = input.toCharArray();
        int numberOfTimes = 0;

        for (int i = 0;i<charArr.length;i++){
            int localNumber = 0;
            for (int j=0; j<charArr.length;j++){
               if (charArr[i] == charArr[j]){
                   localNumber++;
               }


            }
            if (localNumber < numberOfTimes  ){
                maxChar = charArr[i];
            }


        }
        System.out.println(maxChar);
    }*/
}
