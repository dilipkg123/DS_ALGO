package dsandalgo.com.dilip.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestPossibleInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int m = Arrays.stream(arr).max().getAsInt();
        if (m < 1) {
            return 1;
        }
        if (arr.length == 1) {
            if (arr[0] == 1) {
                return 2;
            } else {
                return 1;
            }
        }
        int i = 0;
        int[] l = new int[m];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println(arr[i] + "  " + l[arr[i] - 1]);
                if (l[arr[i] - 1] != 1) {
                    l[arr[i] - 1] = 1;
                }
            }
        }
        System.out.println(Arrays.toString(l));
        for (i = 0; i < l.length; i++) {
            if (l[i] == 0) {
                return i + 1;
            }
        }
        return i + 1;


    }
}


/*        Set<Integer> hs = new HashSet<Integer>();
        for (int a : arr)
            hs.add(a);
        System.out.println(hs.toString());
        final int[] min = {hs.stream().findFirst().orElse(0)};
        Set<Integer> collect = hs.stream().map(e -> e + 1).collect(Collectors.toSet());

        System.out.println(collect.toString());*/