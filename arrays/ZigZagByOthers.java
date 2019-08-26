package dsandalgo.com.dilip.arrays;

public class ZigZagByOthers {
    public static void main(String[] args) {
        int arr[] = {22,21,20,19,18,17,16};
        int len = arr.length;
        int newArr[]= new int[len];
//        int temp =0;
        int max =0;
        for (int i= len-1;i>=0 ; i--) {
            if(i==len-1) {
                max = -1;
//                temp=max;
                newArr[i]=max;
            }
            else {
                if(arr[i+1]>max) {
                    max = arr[i+1];
                    newArr[i]=max;
//                    temp=max;

                }else {
//                    max= temp;
                    newArr[i]=max;
//                    temp=max;

                }


            }
        }

        for(int i =0; i<len ; i++) {
            System.out.println(newArr[i]);
        }
    }
}
