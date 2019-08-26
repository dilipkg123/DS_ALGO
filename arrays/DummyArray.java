package dsandalgo.com.dilip.arrays;

import java.util.Arrays;

public class DummyArray {

    public static void main(String args[]) {
      int[] numArray = new int[5];

      for (int i=0;i<5;i++){
          numArray[i] = i+10;
      }

/*      for(int j:numArray){
          System.out.println(j);
      }*/
        Arrays.stream(numArray).forEach(System.out::println);
    }
}
