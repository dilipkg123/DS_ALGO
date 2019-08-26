package dsandalgo.com.dilip.arrays;

public class TwoDArrays {
    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0, 1},
                {0, 1, 1, 1},
                {0, 0, 1, 1},
                {0, 0, 0, 0}};


        int prev_counter = 0, max_row = 0;
        for (int i = 0; i < mat.length; i++) {
           int counter = 0;
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == 1) {
                    counter += 1;
                }
            }
            if (counter > prev_counter) {
                prev_counter = counter;
                max_row = i+1;
            }
        }

        System.out.println("Row "+max_row+" is having maximum 1s");

    }
}
