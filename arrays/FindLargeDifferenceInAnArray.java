package dsandalgo.com.dilip.arrays;

public class FindLargeDifferenceInAnArray {

    public static void main(String[] args){

//        int[] inputArray = {2,4,11,5,8,1,9};
//        int[] inputArray = {1,12,11,2,10,8,9,0,18};
        int[] inputArray = {1,12,11,2,10,8,9,-100,1000};
        // extected output should be 2,11
        // input: 1,12,11,2,10,8,9
        // expected output should be 1,12
        int minElement = inputArray[0];
        int maxDifference = 0;
        int prevMaxDiff=0;
        int minE=0;
        int maxE=0;
        for(int i=0;i<inputArray.length;i++){
            minElement=Math.min(minElement,inputArray[i]);
            maxDifference=Math.max(maxDifference,inputArray[i]-minElement);
            if (maxDifference>prevMaxDiff) {
                prevMaxDiff = maxDifference;
                minE=minElement;
                maxE=inputArray[i];
            }
        }
        System.out.println(maxDifference);
        System.out.println("min is "+minE+" max is "+maxE);

    }
}
