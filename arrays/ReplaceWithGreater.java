package dsandalgo.com.dilip.arrays;

public class ReplaceWithGreater {
    public static void main(String[] args) {
//        int[] arr = {16,17,4,3,5,2}; // expected o/p 17 5 5 5 2 -1
        int[] arr = {22,21,20,19,18,17,16}; // expected 21 20 19 18 17 16 -1
//        int arr[] = {-1,-2,-3,-4,-5};
        int max=0, temp=0;
        for (int i=arr.length-1; i>=0;i--){
            if (arr.length-1==i) {
                max = arr[i];
                arr[i] = -1;
            }
            else if (arr[i] > max) {
                System.out.println(" I am here arr[i] = "+arr[i]+" max = "+max);
                temp = max;
                max = arr[i];
                arr[i] = temp;

            }
            else if (arr[i] < max) {
                arr[i] = max;
                System.out.println(" I am here "+max);
                }
            }

        for (int d:arr){
            System.out.println("res is "+d);
        }
    }
}
